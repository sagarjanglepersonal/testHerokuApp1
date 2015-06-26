package com.crossmark.etl.membership.config

import com.crossmark.etl.membership.MembershipSource
import com.typesafe.config.Config

/**
 * RabbitMQ Configuration. Supports production/consumption from different ports.
 *
 * @param host Host
 * @param consumerPort Consumer port
 * @param producerPort Producer port
 * @param vhost Virtual Host
 * @param exchange Exchange
 * @param credentials Username and password
 * @param queue Target queue within the exchange
 * @param routingKey Routing key
 */
case class RabbitMQConfiguration(host: String, consumerPort: Int, producerPort: Int, vhost: String, exchange: String,
                                 credentials: UsernamePasswordCredentials, queue: String, routingKey: String)

object RabbitMQConfiguration {
  def apply(config: Config, source: MembershipSource): RabbitMQConfiguration = {
    val routingConfig = config.getConfig(source.name)
    RabbitMQConfiguration(config.getString("host"), config.getInt("consumerPort"), config.getInt("producerPort"), config.getString("vhost"),
      config.getString("exchange"), UsernamePasswordCredentials(config.getString("username"), config.getString("password")),
      routingConfig.getString("queue"), routingConfig.getString("routingKey"))
  }
}