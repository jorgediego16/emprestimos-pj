name := """emprestimos-pj"""
organization := "com.justa"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  guice,
  javaJdbc,
  evolutions,
  jdbc,
  "mysql" % "mysql-connector-java" % "5.1.41",
  "org.projectlombok" % "lombok" % "1.12.6",
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "4.3.6.Final",
  "io.ebean" % "ebean" % "11.22.10"
)

