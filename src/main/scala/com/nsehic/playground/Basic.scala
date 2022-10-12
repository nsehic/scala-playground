package com.nsehic.playground

object Basic {
  def example(): Unit ={

    val constant = {
      println("Entering constant")
      "Return value"
    }

    var variable = {
      println("Entering variable")
      "Return value"
    }

    def function(): String = {
      println("Entering function")
      "Return value"
    }

    lazy val lazyValue = {
      println("Entering lazy")
      "Return value"
    }

    println(constant)
    println(variable)
    println(function())
    println(lazyValue)

  }
}
