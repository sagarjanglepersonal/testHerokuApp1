package com.crossmark.etl.membership.aarp

import java.util

import akka.actor.{ActorRef, Props}
import akka.camel.{Ack, CamelExtension, CamelMessage, Consumer}
import akka.event.Logging
import com.crossmark.etl.membership.config.{SourceConfiguration, SftpConfiguration, RabbitMQConfiguration}
import org.apache.camel.{CamelContext, ProducerTemplate}

/**
 * Consume rows from RabbitMQ.
 * @param config Configuration for this source
 * @param batching Actor that handles message batching
 */
class ConversionConsumer(val config: SourceConfiguration, val batching: ActorRef) extends Consumer {
  val log = Logging(context.system, this)

  override def endpointUri: String = s"rabbitmq://${config.rmq.host}:${config.rmq.consumerPort}/${config.rmq.exchange}?vhost=${config.rmq.vhost}&queue=${config.rmq.queue}&username=${config.rmq.credentials.username}&password=${config.rmq.credentials.password}&routingKey=${config.rmq.routingKey}&autoDelete=false"

  /**
   * Consume a single message. If a camel message is received, the body string is converted using the [[AARPRecordConverter]] and passed
   * to the batching actor.
   */
  def receive = {
    case msg: CamelMessage =>
      try {
        val converted = config.source.converter.convertRow(msg.bodyAs[String])
        batching ! (msg.getHeaderAs("CamelFileName", classOf[String], camelContext), converted)
      }
      catch {
        case ex: Exception => log.error(ex, s"Failed to convert row and deliver message: ${ex.getMessage}")
      }
    case _ =>
      log.warning("Received unknown message type.")
  }
}
