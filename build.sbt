name := """emprestimospj"""
organization := "com.justa"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  javaJdbc,
  javaJpa,
  cacheApi,
  ehcache,
  filters,
  evolutions,
  javaWs,
  guice,
  "mysql" % "mysql-connector-java" % "5.1.41",
  "org.projectlombok" % "lombok" % "1.12.6",
  "io.jsonwebtoken" % "jjwt" % "0.9.0",
  "org.webjars" % "swagger-ui" % "3.23.0",
  "io.swagger" % "swagger-core" % "1.5.3"
)

resolvers += Resolver.url("Typesafe Ivy releases", url("https://repo.typesafe.com/typesafe/ivy-releases"))(Resolver.ivyStylePatterns)

sources in (Compile, doc) := Seq.empty
publishArtifact in (Compile, packageDoc) := false

