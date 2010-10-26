package com.chilang

object SayHello extends Application with Core {
  println(sayHello("world"))

  def sayHello(name: _root_.scala.Predef.String) = "Hello "+name

}
