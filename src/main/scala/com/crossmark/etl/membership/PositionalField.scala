package com.crossmark.etl.membership

case class PositionalField(name: String, sequence: Int, length: Int, start: Int, end: Int) {
  val substringStart = start - 1
  val substringEnd = end - 1
}