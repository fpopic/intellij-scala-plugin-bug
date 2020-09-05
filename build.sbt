name := "intellij-scala-plugin-bug"
version := "0.1"
scalaVersion := "2.13.3"

lazy val externalProject = RootProject(
  build = uri(s"ssh://git@github.com/fpopic/github-repo-hosting-protobuf.git")
)

lazy val root = (project in file("."))
  .dependsOn(externalProject)
