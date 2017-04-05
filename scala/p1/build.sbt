name := "scala-sandbox"

organization := "jp.qilab"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.7"

lazy val depProj = (project in file("."))
  .dependsOn(file("../dep-proj"))
  .dependsOn(file("../dep-proj") % "test->test")

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.8.9" % "test",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

scalacOptions in Compile ++= Seq("-unchecked", "-deprecation", "-feature", "-Xlint", "-Ywarn-dead-code", "-Ywarn-numeric-widen")

