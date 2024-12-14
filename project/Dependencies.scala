import sbt._

object Version {
  val test = "0.1.7"
  val cats = "2.12.0"
}

object Library {
  val test     = "org.scala-lang" %% "toolkit-test" % Version.test % Test
  val catsCore = "org.typelevel"  %% "cats-core"    % Version.cats
  val catsFree = "org.typelevel"  %% "cats-free"    % Version.cats
}
