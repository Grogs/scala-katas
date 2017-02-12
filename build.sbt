import sbt.ExclusionRule

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

name := "skala-katas"

organization := "com.shaiyallin"

version := "0.1.0-SNAPSHOT"

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.8"

libraryDependencies += "org.specs2" %% "specs2" % "2.4.17" % "test"

