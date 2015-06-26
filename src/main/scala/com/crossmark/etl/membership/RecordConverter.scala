package com.crossmark.etl.membership

trait RecordConverter {
  def convertRow(line: String): String
}
