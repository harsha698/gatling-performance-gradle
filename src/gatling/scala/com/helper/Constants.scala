package com.helper

object ConstantsData{

  val BASE_URL = "https://katalon-demo-cura.herokuapp.com"
  val ACCEPT_HEADER = "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9"
  val ACCEPT_ENCODING_HEADER = "gzip, deflate, br"
  val ACCEPT_LANGUAGE_HEADER = "en-GB,en-US;q=0.9,en;q=0.8"
  val USER_AGENT_HEADER = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) " +
    "Chrome/87.0.4280.67 Safari/537.36"

  object URLS {
    val PROFILE = s"${BASE_URL}/profile.php"
    val LOGIN = s"${BASE_URL}/authenticate.php"
    val LOGOUT = s"${BASE_URL}/authenticate.php?logout"
    val BOOK_APPOINTMENT = s"${BASE_URL}/appointment.php"
    val HISTORY = s"${BASE_URL}/history.php"
  }

  object SECRETS {
    val USER_NAME = "John Doe"
    val PASSWORD = "ThisIsNotAPassword"
  }
}