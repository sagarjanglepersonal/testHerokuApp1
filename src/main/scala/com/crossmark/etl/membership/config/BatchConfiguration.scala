package com.crossmark.etl.membership.config

import com.crossmark.etl.membership.MembershipSource
import com.typesafe.config.Config

case class BatchConfiguration(threshold: Int, rate: Int)

object BatchConfiguration {
  def apply(parentConfig: Config, source: MembershipSource): BatchConfiguration = {
    val config = parentConfig.getConfig(source.name)
    BatchConfiguration(config.getInt("threshold"), config.getInt("rate"))
  }
}
