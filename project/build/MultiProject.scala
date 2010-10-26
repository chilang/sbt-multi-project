import sbt._
class MultiProject(info:ProjectInfo) extends ParentProject(info) with IdeaProject {

  class MySubProject(info:ProjectInfo)
  lazy val core = project("modules" / "core", "Core module", new DefaultProject(_) with IdeaProject)
  lazy val ui = project("modules" / "ui", "User Interface module", new DefaultProject(_) with IdeaProject, core)

  lazy val hi = task { println("hello"); None }
}