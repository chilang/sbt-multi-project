package com.chilang

object SayHello extends Application with Core {
  val javaNamed = new Named {
    def name = "Java"
  }
  println(sayHello(javaNamed))

  def sayHello(named: Named) = "Scala say hello to: "+named.name
}
