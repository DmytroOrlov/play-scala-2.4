lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "play-scala-2.4",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.11.11",
    routesGenerator := InjectedRoutesGenerator
  )
