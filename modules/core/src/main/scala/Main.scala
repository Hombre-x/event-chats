package com.graphene

import cats.effect.{IO, IOApp}
import cats.effect.std.Console

object Main extends IOApp.Simple:
    
  override def run: IO[Unit] = Console[IO].error("This is an error wooooo! Spooky 👻")
    
end Main