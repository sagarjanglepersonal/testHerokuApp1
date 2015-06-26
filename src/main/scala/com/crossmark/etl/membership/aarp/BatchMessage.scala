package com.crossmark.etl.membership.aarp

sealed abstract class BatchMessage
object Commit extends BatchMessage
object TimeCommit extends BatchMessage