package com.crossmark.etl.membership.config

/**
 * Enumeration representing different file-completion actions.
 *
 * @param name The name of the action.
 */
sealed abstract class SftpFileComplete(val name: String) {}

case object NoAction extends SftpFileComplete("noaction")
case object DeleteFile extends SftpFileComplete("delete")
case object MoveFile extends SftpFileComplete("move")