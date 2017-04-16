lazy val root = project.in(file("."))
  .enablePlugins(JavaAppPackaging, AshScriptPlugin, DockerPlugin)
  .settings(
    organization := "com.github.qilab",
    name := "docker-ex",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.12.1",
    mainClass in (Compile, run) := Some("Main"),
    libraryDependencies ++= Seq(
      "com.twitter" %% "finagle-http" % "6.43.0"
    ),
    dockerBaseImage in Docker := "java:8-jdk-alpine",
    dockerExposedPorts in Docker := Seq(8080, 8080)
  )
