package com.crossmark.etl.membership

import com.crossmark.etl.membership.aarp.AARPRecordConverter

sealed abstract class MembershipSource(val name: String, val converter: RecordConverter) {}

object MembershipSource {
  def apply(name: String): MembershipSource = {
    name.toLowerCase.trim match {
      case "aarp" => AARP
      case "aaa" => AAA
      case _ => UnknownMembershipSource
    }
  }
}

case object AARP extends MembershipSource("aarp", new AARPRecordConverter)
case object AAA extends MembershipSource("aaa", null)
case object UnknownMembershipSource extends MembershipSource("unknown", null)
