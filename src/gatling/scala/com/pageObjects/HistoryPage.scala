package com.pageObjects

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import com.helper.ConstantsData._

object HistoryPage {

  val checkHistory = http("Check History")
    .get(URLS.HISTORY)
}