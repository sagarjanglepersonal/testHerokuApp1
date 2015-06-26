package com.crossmark.etl.membership.aarp

import java.util

import akka.actor.{PoisonPill, Actor}
import akka.event.Logging
import com.crossmark.etl.membership.config.SftpConfiguration
import org.apache.camel.ProducerTemplate
import akka.camel.CamelExtension

/**
 * An actor devoted to delivering files to some SFTP endpoint.
 *
 * @param sftp SFTP configuration.
 */
class SftpDeliveryActor(sftp: SftpConfiguration) extends Actor {
  val log = Logging(context.system, this)
  val destinationUri: String = s"sftp://${sftp.host}/out?username=${sftp.credentials.username}&password=${sftp.credentials.password}&fileExist=Append"
  val template: ProducerTemplate = CamelExtension(context.system).context.createProducerTemplate()

  /**
   * Consume a single message. This message should contain a filename and a partial body. Camel is used to send this body to the
   * destination endpoint, which uses SFTP to append the body to the given file.
   */
  def receive = {
    case (fileName: String, fileBody: String) =>
      log.info(s"Received delivery request for file $fileName")
      val headers = new util.HashMap[String, Object]()
      headers.put("CamelFileName", fileName: Object)
      template.sendBodyAndHeaders(destinationUri, fileBody, headers)
      self ! PoisonPill
    case _ =>
      log.warning("Received unexpected message")
      self ! PoisonPill
  }
}
