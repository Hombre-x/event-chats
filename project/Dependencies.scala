import sbt.*
object Dependencies { // TODO: Look a way to change this horrible Scala 2 syntax to the newer one
  
  private object Versions {
    
    // Scala
    val cats       = "2.10.0"
    val catsEffect = "3.5.2"
    val circe      = "0.14.6"
    val fs2        = "3.9.3"
    val http4s     = "0.23.24"
    val log4cats   = "2.6.0"
    val skunk      = "0.6.2"
    val neutron    = "0.8.0"
    
    // Test
    val weaver = "0.8.3"
    
    // Java
    val logback = "1.4.14"
    
  }
  
  private object Organizations {
    
    val typelevel  = "org.typelevel"
    val fs2        = "co.fs2"
    val circe      = "io.circe"
    val http4s     = "org.http4s"
    val skunk      = "org.tpolecat"
    val disney     = "com.disneystreaming"
    val profunktor = "dev.profunktor"
    val logback    = "ch.qos.logback"
    
  }
  
  object Libraries {
    
    // Cats
    val catsCore      = Organizations.typelevel %% "cats-core"      % Versions.cats
    val catsEffect    = Organizations.typelevel %% "cats-effect"    % Versions.catsEffect
    val log4catsCore  = Organizations.typelevel %% "log4cats-core"  % Versions.log4cats
    val log4catsSlf4j = Organizations.typelevel %% "log4cats-slf4j" % Versions.log4cats
    
    // Circe
    val circeCore = Organizations.circe %% "circe-core" % Versions.circe
    
    // Fs2
    val fs2Core = Organizations.fs2 %% "fs2-core" % Versions.fs2
    val fs2Io   = Organizations.fs2 %% "fs2-io"   % Versions.fs2
    
    // http4s
    val http4sDsl         = Organizations.http4s %% "http4s-dsl"          % Versions.http4s
    val http4sCore        = Organizations.http4s %% "http4s-core"         % Versions.http4s
    val http4sCirce       = Organizations.http4s %% "http4s-circe"        % Versions.http4s
    val http4sBlazeServer = Organizations.http4s %% "http4s-blaze-server" % Versions.http4s
    val http4sBlazeClient = Organizations.http4s %% "http4s-blaze-client" % Versions.http4s
    
    // Skunk
    val skunkCore = Organizations.skunk %% "skunk-core" % Versions.skunk
    
    // Neutron
    val neutronCore  = Organizations.profunktor %% "neutron-core"  % Versions.neutron
    val neutronCirce = Organizations.profunktor %% "neutron-circe" % Versions.neutron
    
    // Weaver
    val weaverCats       = Organizations.disney %% "weaver-cats"       % Versions.weaver % Test
    val weaverScalaCheck = Organizations.disney %% "weaver-scalacheck" % Versions.weaver % Test
    
    // Logback
    val logback = Organizations.logback % "logback-classic" % Versions.logback
    
  }
  
}

