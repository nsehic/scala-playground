package com.nsehic.playground

object AdvancedObjects {

  def example(): Unit = {
    println(add(1, 5, Calculator))
  }

  object Calculator {
    def add(a: Int, b: Int): Int =
      a + b
  }

  def add(a: Int, b: Int, calculator: Calculator.type): Int =
    calculator.add(a, b)

}
