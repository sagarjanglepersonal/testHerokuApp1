package com.crossmark.etl.membership.config

import com.crossmark.etl.membership.MembershipSource
import com.typesafe.config.Config

/**
 * SFTP Configuration
 *
 * @param host Host
 * @param remoteDirectory Source directory on remote host
 * @param credentials Username and password
 * @param completion Action to take after file ingested
 */
case class SftpConfiguration(host: String, remoteDirectory: String, credentials: UsernamePasswordCredentials, completion: SftpFileComplete)

object SftpConfiguration {
  def apply(config: Config, source: MembershipSource): SftpConfiguration = {
    val sourceConfig = config.getConfig(source.name)

    val fileComplete = sourceConfig.getString("complete") match {
      case fc: String if fc.toLowerCase.trim == NoAction.name.toLowerCase.trim => NoAction
      case fc: String if fc.toLowerCase.trim == DeleteFile.name.toLowerCase.trim => DeleteFile
      case fc: String if fc.toLowerCase.trim == MoveFile.name.toLowerCase.trim => MoveFile
      case _ => NoAction
    }

    SftpConfiguration(sourceConfig.getString("host"), sourceConfig.getString("remoteDirectory"),
      UsernamePasswordCredentials(sourceConfig.getString("username"), sourceConfig.getString("password")), fileComplete)
  }
}
