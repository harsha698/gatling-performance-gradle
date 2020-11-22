package com.journeys

import io.gatling.core.Predef._
import scala.concurrent.duration._
import com.helper.ConstantsData._
import com.pageObjects._

class MakeAnAppointment extends Simulation {

  object appointment {

    val myAppointment =
      exec(LandingPage.getlandingPage)
        .exec(AuthenticatePage.getProfile)
        .exec(AuthenticatePage.login)
        .exec(AppointmentPage.bookAppointment)
        .exec(HistoryPage.checkHistory)
        .exec(AuthenticatePage.logout)
  }

  val bookAnAppointment = scenario("Test appointment booking")
    .exec(appointment.myAppointment)

  setUp(
    bookAnAppointment.inject(
      rampUsers(1) during (2 seconds)
    )
  )
    .assertions(
      global.responseTime.max.lte(2000),
      forAll.failedRequests.count.lt(1)
    )
    .protocols(basePage.httpProtocol)

}