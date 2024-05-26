ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.3"

ThisBuild / semanticdbEnabled := true

lazy val root = (project in file("."))
  .settings(
    name := "s99"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.18" % "test"
libraryDependencies += "org.mockito" % "mockito-core" % "5.12.0" % "test"
