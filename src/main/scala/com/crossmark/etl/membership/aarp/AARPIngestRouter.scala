package com.crossmark.etl.membership.aarp

import java.util.UUID

import akka.actor.ActorSystem
import com.crossmark.etl.membership.config._
import org.apache.camel.builder.RouteBuilder

/**
 * Routes new files from SFTP, splits them per line, and submits them to RabbitMQ.
 *
 * @param system The Actor System
 * @param sftp The SFTP Configuration
 * @param rmq The RabbitMQ Configuration
 */
class AARPIngestRouter(val system: ActorSystem,  sftp: SftpConfiguration, val rmq: RabbitMQConfiguration) extends RouteBuilder {
  override def configure(): Unit = {
    from(s"sftp://${sftp.host}/${sftp.remoteDirectory}?username=${sftp.credentials.username}&password=${sftp.credentials.password}&idempotent=true${onComplete(sftp.completion)}&streamDownload=true")
      .setHeader("UUID", simple(UUID.randomUUID().toString))
      .setHeader("rabbitmq.ROUTING_KEY", simple(rmq.routingKey))
      .split(body().tokenize("\r\n"))
      .streaming()
      .to(s"rabbitmq://${rmq.host}:${rmq.producerPort}/${rmq.exchange}?vhost=${rmq.vhost}&queue=${rmq.queue}&username=${rmq.credentials.username}&password=${rmq.credentials.password}&routingKey=${rmq.routingKey}&declare=false")
  }

  /**
   * Determine the correct query parameter to use for file completion.
   *
   * @param action The action to take.
   * @return The query parameter or an empty string for no action.
   */
  def onComplete(action: SftpFileComplete): String = action match {
    case NoAction => ""
    case DeleteFile => "&delete=true"
    case MoveFile => "&move=.done"
    case _ => ""
  }
}
