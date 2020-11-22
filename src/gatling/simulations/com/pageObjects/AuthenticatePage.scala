package com.pageObjects

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import com.helper.ConstantsData._

object AuthenticatePage {

  val userName = SECRETS.USER_NAME
  val password = SECRETS.PASSWORD

  val getProfile = http("Get Profile")
    .get(URLS.PROFILE)
    .check(status.is(200))

  val login = http("Do Login")
    .post(URLS.LOGIN)
    .formParamSeq(
      Seq(
        ("username", userName),
        ("password", password)
      ))
    .check(status.is(200))

  val logout = http("Do Logout")
    .get(URLS.LOGOUT)
    .check(status.is(200))
}


