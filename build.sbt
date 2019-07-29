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
  javaWs,
  javaJpa,
  "mysql" % "mysql-connector-java" % "5.1.41",
  "org.projectlombok" % "lombok" % "1.12.6",
  "javax.xml.bind" % "jaxb-api" % "2.3.0",
  "io.jsonwebtoken" % "jjwt" % "0.9.0",
  "org.webjars" % "swagger-ui" % "3.23.0",
  "io.swagger" % "swagger-core" % "1.5.3",
  "org.hibernate" % "hibernate-entitymanager" % "4.3.6.Final",
  "io.ebean" % "ebean" % "11.22.10"
)

