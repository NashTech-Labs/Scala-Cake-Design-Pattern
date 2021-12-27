name := """Design patterns"""
version := "1.0"
scalaVersion := "2.12.1"

libraryDependencies ++= Seq (
  "com.typesafe.akka" %% "akka-actor" % "2.6.14",
  "com.typesafe.akka" %% "akka-http" % "10.2.4",
  "com.typesafe.akka" %% "akka-stream" % "2.6.14",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.2.4",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.typesafe.slick" %% "slick" % "3.3.3",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.3.3",
  "mysql" % "mysql-connector-java" % "8.0.25",
  "com.pauldijou" %% "jwt-spray-json" % "5.0.0",
  "org.scalatest" %% "scalatest" % "3.2.3" % Test,
  "org.mockito" % "mockito-core" % "1.9.5" % Test,
  "org.scalamock" %% "scalamock" % "4.4.0" % Test,
  "org.mockito" %% "mockito-scala-scalatest" % "1.15.0" % Test,
  "org.mockito" %% "mockito-scala" % "1.14.8"
)
