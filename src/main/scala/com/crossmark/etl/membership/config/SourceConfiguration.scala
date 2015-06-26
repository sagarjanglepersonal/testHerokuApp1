package com.crossmark.etl.membership.config

import com.crossmark.etl.membership.MembershipSource

case class SourceConfiguration(source: MembershipSource, sftp: SftpConfiguration, rmq: RabbitMQConfiguration, batch: BatchConfiguration)
