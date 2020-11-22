package com.pageObjects

import com.helper.ConstantsData._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object basePage {

  val httpProtocol = http
    .baseUrl(BASE_URL)
    .warmUp(BASE_URL)
    .acceptHeader(ACCEPT_HEADER)
    .acceptEncodingHeader(ACCEPT_ENCODING_HEADER)
    .acceptLanguageHeader(ACCEPT_LANGUAGE_HEADER)
    .userAgentHeader(USER_AGENT_HEADER)
}