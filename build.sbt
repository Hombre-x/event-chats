ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.1"

ThisBuild / organization := "com.graphene"

ThisBuild / name := "EventChats"

ThisBuild / idePackagePrefix := Some("com.graphene")

// Root
lazy val root = (project in file("."))
  .settings(
    name := "EventChats",
  )

// Common
lazy val common = (project in file("modules/common"))

// Core
lazy val core = (project in file("modules/core"))
  .settings(
    libraryDependencies ++= List(
      "org.typelevel" %% "cats-core" % "2.9.0",
      "org.typelevel" %% "cats-effect" % "3.5.0",
    )
  )

// User Sign-in
lazy val login = (project in file("modules/login"))

// Logger timestamp
lazy val logger = (project in file("modules/logger"))

// Chat service
lazy val chat = (project in file("modules/chat"))

// Online user notification
lazy val onlineUsers = (project in file("modules/onlineUsers"))





