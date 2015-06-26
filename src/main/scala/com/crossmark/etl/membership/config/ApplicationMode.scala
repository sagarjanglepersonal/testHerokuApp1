package com.crossmark.etl.membership.config

sealed abstract class ApplicationMode(val name: String) {}

object ApplicationMode {
  def apply(mode: String): ApplicationMode = mode match {
    case "ingest" => Ingest
    case "conversion" => Conversion
    case "dual" => Dual
    case _ => Dual
  }
}

case object Ingest extends ApplicationMode("ingest")
case object Conversion extends ApplicationMode("conversion")
case object Dual extends ApplicationMode("dual")