package com.crossmark.etl.transaction

object Ingest extends App {
  consumeFiles()

  /**
   * Load application configuration, initialize Camel, configure Camel, prepare all relevant consumers, and initiate ingest.
   */
  def consumeFiles() = {
        println(" Application To Run ")
  } 
}