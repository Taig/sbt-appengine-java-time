enablePlugins(AppenginePlugin)

libraryDependencies ++=
  "com.google.appengine" % "appengine-api-1.0-sdk" % "1.9.63" ::
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided" ::
  "org.mortbay.jetty" % "jetty" % "6.1.26" % "container" ::
  Nil

scalaVersion := "2.12.6"
