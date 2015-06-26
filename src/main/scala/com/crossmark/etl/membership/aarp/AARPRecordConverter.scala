package com.crossmark.etl.membership.aarp

import com.crossmark.etl.membership.RecordConverter

/**
 * [[RecordConverter]] implementation for [[AARPRecord]] input.
 */
class AARPRecordConverter extends RecordConverter {

  /**
   * Given a string representing a single row of a flat file, convert that row to a CSV format.
   *
   * Certain fields need to be redacted, because they contain information that identifies an individual. Currently this amounts to two
   * date of birth fields. They should be replaced with an empty string.
   *
   * @param line The line to convert
   * @return The converted line
   */
  def convertRow(line: String): String = {
    val builder = new StringBuilder()
    var first = true
    AARPRecord.fields foreach { field =>
      if (!first) builder append "," else first = false

      field.name match {
        case "Birth_Dt_Agg_Ind" => builder
        case "sec_birth_dt_agg_act" => builder
        case _ => builder append quoteField(line.substring(field.substringStart, field.end).trim)
      }
    }

    builder append "\n"
    builder.toString()
  }

  def quoteField(field: String): String = {
    field.contains("\"") || field.contains(",") match {
      case true => "\"" + field.replaceAll("\\\"", "\"\"") + "\""
      case false => field
    }
  }
}
