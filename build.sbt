ThisBuild / version := "0.0.1-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.1"

ThisBuild / organization := "com.graphene"

ThisBuild / name := "EventChats"

ThisBuild / idePackagePrefix := Some("com.graphene")

import Dependencies.Libraries

// Root
lazy val root = (project in file("."))
  .settings( name := "EventChats", version := "0.0.1-SNAPSHOT" )
  .aggregate(common, core, login, logger, chat, onlineUsers, ui)
  .dependsOn(common, core, login, logger, chat, onlineUsers, ui)

// Common
lazy val common = (project in file("modules/common"))
  .settings(
    name := "EventChats.common",
    version := "0.0.1",
    libraryDependencies ++= List(
      Libraries.catsCore,
      Libraries.catsEffect,
      Libraries.weaverCats,
      Libraries.weaverScalaCheck,
    ),
    testFrameworks += new TestFramework("weaver.framework.TestFramework"),
    
  )

// Core
lazy val core = (project in file("modules/core"))
  .settings(
    name := "EventChats.core",
    version := "0.0.1",
    testFrameworks += new TestFramework("weaver.framework.TestFramework"),
  ).dependsOn(common)

// User Sign-in
lazy val login = (project in file("modules/login"))
  .settings(
    name := "EventChats.login",
    version := "0.0.1",
  )

// Logger timestamp
lazy val logger = (project in file("modules/logger"))
  .settings(
    name := "EventChats.logger",
    version := "0.0.1",
  )

// Chat service
lazy val chat = (project in file("modules/chat"))
  .settings(
    name := "EventChats.chat",
    version := "0.0.1",
  )

// Online user notification
lazy val onlineUsers = (project in file("modules/online-users"))
    .settings(
        name := "EventChats.online-users",
        version := "0.0.1",
    )

// UI
lazy val ui = (project in file("modules/ui"))



