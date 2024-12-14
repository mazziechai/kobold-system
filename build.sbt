val scala3Version = "3.6.2"

lazy val root = project
  .in(file("."))
  .settings(
    name         := "kobold",
    version      := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= List(
      Library.test,
      Library.catsCore,
      Library.catsFree
    )
  )
