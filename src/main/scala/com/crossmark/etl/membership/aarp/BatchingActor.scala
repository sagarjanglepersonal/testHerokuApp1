package com.crossmark.etl.membership.aarp

import akka.actor.{Props, Actor}
import akka.event.Logging
import com.crossmark.etl.membership.config.SftpConfiguration
import org.joda.time.DateTime

import scala.collection.mutable.ArrayBuffer

/**
 * Actor which maintains an internal buffer for incoming data. Data is added until the buffer is full, at which point the actor sends itself
 * a 'Commit' message. Upon receipt of a 'Commit', the actor processes the entire buffer and submits it to SFTP.
 *
 * @param size The buffer size.
 * @param sftp SFTP configuration.
 */
class BatchingActor(val size: Int, val milliseconds: Int, val sftp: SftpConfiguration) extends Actor {
  val log = Logging(context.system, this)
  val batch = new ArrayBuffer[(String, String)](size)
  var lastCommit = System.currentTimeMillis()

  /**
   * Handle an incoming message. There are two valid message formats:
   * - (file name, row)
   * - Commit
   */
  def receive = {
    case (fileName: String, row: String) =>
      batch.append((fileName, row))
      if (batch.length >= size) self ! Commit
    case Commit =>
      log.debug(s"Committing batch with ${batch.size} items")
      if (batch.nonEmpty) commitBatch()
    case TimeCommit =>
      if (batch.nonEmpty) {
        val current = System.currentTimeMillis()
        if (current - lastCommit >= milliseconds) {
          log.debug(s"Committing batch with ${batch.size} items after delay of ${current - lastCommit} milliseconds.")
          commitBatch()
        }
        else {
          log.info("Skipping scheduled commit (not enough time has passed)")
        }
      }
      log.debug(s"")
    case _ => log.warning("Received unknown message type")
  }

  /**
   * Commit a batch of messages. For each unique file name, combine all of the rows for that file. Submit each row combination to a
   * unique file via SFTP.
   */
  def commitBatch() = {
    batch groupBy {
      case (fileName, row) => fileName
    } map {
      case (fileName, messages: ArrayBuffer[(String, String)]) =>
        (fileName, messages.foldLeft(new StringBuilder)((acc, message) => acc.append(message._2)).toString())
    } foreach {
      case (fileName, fileBody) =>
        log.debug(s"Committing batch with character count ${fileBody.length} for file $fileName")
        context.system.actorOf(Props(classOf[SftpDeliveryActor], sftp)) ! (fileName, fileBody)
    }

    // Update the time of last commit and clear the batch
    lastCommit = System.currentTimeMillis()
    batch.clear()
  }
}
