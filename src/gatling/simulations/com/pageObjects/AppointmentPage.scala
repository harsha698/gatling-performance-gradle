package com.pageObjects

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import com.helper.ConstantsData._

object AppointmentPage {

  val bookAppointment = http("Book an appointment")
    .post(URLS.BOOK_APPOINTMENT)
    .formParamSeq(
      Seq(
        ("facility", "Tokyo+CURA+Healthcare+Center"),
        ("hospital_readmission", "Yes"),
        ("programs", "Medicaid"),
        ("visit_date", "21%2F01%2F2021"),
        ("comment", "My+new+appointment")
      ))
    .check(status.is(200))
}