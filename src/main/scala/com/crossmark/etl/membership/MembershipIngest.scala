package com.crossmark.etl.membership

import java.util.concurrent.TimeUnit

import akka.actor.{Props, ActorSystem}
import com.crossmark.etl.membership.aarp._
import com.crossmark.etl.membership.config._
import com.typesafe.config.{Config, ConfigFactory}
import org.apache.camel.CamelContext
import akka.camel.CamelExtension

import scala.collection.JavaConversions._
import scala.concurrent.duration.Duration

/**
 * Driver for the application
 */
object MembershipIngest extends App {
  implicit val system: ActorSystem = ActorSystem("ingest-system")
  import system.dispatcher
  initialize()

  /**
   * Load configuration and initiate Camel.
   */
  def initialize() = {
    val config = ConfigFactory.load().getConfig("membership")
    val mode = ApplicationMode(config.getString("mode"))
    val sources = loadConfiguration(config)

    sources map { s =>
      if (mode == Conversion || mode == Dual) buildConsumers(s)
      if (mode == Ingest || mode == Dual) buildProducer(s)
    }
  }

  /**
   * Load the configuration for each source of membership data.
   *
   * @param config The root configuration.
   * @return The list of configuration for all sources.
   */
  def loadConfiguration(config: Config): List[SourceConfiguration] = {
    config.getStringList("sources").toList map { s =>
      val source = MembershipSource(s)
      SourceConfiguration(source,
        SftpConfiguration(config.getConfig("sftp"), source),
        RabbitMQConfiguration(config.getConfig("rabbitmq"), source),
        BatchConfiguration(config.getConfig("batch"), source))
    }
  }

  def buildConsumers(s: SourceConfiguration) = {
    val batchingActor = system.actorOf(Props(classOf[BatchingActor], s.batch.threshold, s.batch.rate * 1000, s.sftp))
    val rate = s.batch.rate
    system.scheduler.schedule(Duration.create(rate, TimeUnit.SECONDS), Duration.create(rate, TimeUnit.SECONDS), batchingActor, TimeCommit)
    system.actorOf(Props(classOf[ConversionConsumer], s, batchingActor))
  }

  def buildProducer(s: SourceConfiguration) = {
    s.source match {
      case AARP =>
        val camel = CamelExtension(system)
        val camelContext: CamelContext = camel.context
        camelContext.addRoutes(new AARPIngestRouter(system, s.sftp, s.rmq))
      case _ => println(s"Unsupported source: ${s.source.name}")
    }
  }
}
