import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._

lazy val root = (project in file(".")).
  enablePlugins(JavaAppPackaging).
  settings(
    name := "membership-ingest",
    version := "1.0",
    scalaVersion := "2.11.4",
    resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
    scalacOptions ++= Seq("-feature", "-deprecation"),
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % "2.3.7",
      "com.typesafe.akka" %% "akka-camel" % "2.3.7",
      "org.apache.camel" % "camel-ftp" % "2.14.0",
      "org.apache.camel" % "camel-rabbitmq" % "2.14.0",
      "org.apache.camel" % "camel-aws" % "2.14.0",
      "org.slf4j" % "slf4j-api" % "1.7.2",
      "ch.qos.logback" % "logback-classic" % "1.0.7",
      "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
    )
  )
