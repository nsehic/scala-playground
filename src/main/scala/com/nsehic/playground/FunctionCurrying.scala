package com.nsehic.playground

object FunctionCurrying {
  def example(): Unit = {
    calculatorExample()
  }

  // Curried Function
//  def plus(a: Int): Int => Int = b => a + b

  // Syntactic sugar for curried functions..
  def plus(a: Int)(b: Int): Int = a + b

  def functionCurryingStandardLibraryExample(): Unit = {
    println(
      List(1, 2, 3, 4).foldLeft(1) { _ * _}
    )

    // Same as the below
    println(
      List(1, 2, 3, 4).product
    )
  }


  class Calculator(a: Int) {
    println("Executed during construction...")

    def add(b: Int): Int = a + b
    def subtract(b: Int): Int = a - b
  }

  def calculatorExample(): Unit = {
    val calc = new Calculator(a = 1)

    val addResult = calc.add(5)
    val subtractResult = calc.subtract(1)

    println(addResult)
    println(subtractResult)

  }
}
