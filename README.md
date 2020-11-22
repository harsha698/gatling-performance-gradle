# Gatling with Gradle Using POM

This is a performance testing project to demonstrate use of Page Object Model with Gatling

## Steps to Execute

* Build the project
:point_right: gradle clean build
* Run the test
:point_right: gradle gatlingRun-com.journeys.MakeAnAppointment --rerun-tasks
* Checkout the reports
:point_right: in build/reports/gradle path, a folder gets generated having index.html file which can be viewed to
 check the report.
