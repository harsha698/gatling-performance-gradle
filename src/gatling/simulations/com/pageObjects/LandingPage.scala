package com.pageObjects

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import com.helper.ConstantsData._

object LandingPage {
  val getlandingPage = http("Get Landing Page")
    .get(BASE_URL + "/")
    .check(status.is(200))
}