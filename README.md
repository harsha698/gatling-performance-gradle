# Gatling with Gradle Using POM

This is a performance testing project to demonstrate use of Page Object Model with Gatling

## Steps to Execute

* Build the project
```
gradle clean build
```
* Run the test
```
gradle gatlingRun-com.journeys.MakeAnAppointment --rerun-tasks
```
* Checkout the reports
```
in build/reports/gradle path, a folder gets generated having index.html file which can be viewed to
 check the report.
```
