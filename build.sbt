import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._

lazy val root = (project in file(".")).
  enablePlugins(JavaAppPackaging).
  settings(
    name := "incomm-transaction-processing",
    version := "1.0",
    scalaVersion := "2.11.4",
    resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
    scalacOptions ++= Seq("-feature", "-deprecation"),
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % "2.3.7",
      "com.typesafe.akka" %% "akka-camel" % "2.3.7",
      "com.typesafe.play" %% "play-json" % "2.3.4",
      "org.mongodb" %% "casbah" % "2.7.4",
      "org.apache.camel" % "camel-quartz" % "2.14.0",
      "org.apache.camel" % "camel-ftp" % "2.14.0",
      "org.apache.camel" % "camel-jetty" % "2.14.0",
      "org.apache.camel" % "camel-rabbitmq" % "2.14.0",
      "org.slf4j" % "slf4j-api" % "1.7.2",
      "ch.qos.logback" % "logback-classic" % "1.0.7",
      "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
    )
  )
