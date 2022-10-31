package com.nsehic.playground

object ObjectsAndProperties {

  def example(): Unit = {
    val calc = new Calculator(5)
  }


  // Companion object for `Calculator` class
  // Items within this object are like static fields or methods in Java classes
  object Calculator {
    private var _calculatorsCreated: Int = 0

    def calculatorsCreated: Int = _calculatorsCreated
    def calculatorsCreated_= (newValue: Int): Unit =
      _calculatorsCreated = newValue
  }


  trait Add {
    def add(b: Int): Int
  }

  trait Subtract {
    // forces classes that extend Subtract to also extend `Add`
    // therefore giving us access to `Add` methods from here
    this: Add =>

    def subtract(b: Int): Int = add(-b)
  }

  trait SubtractWithAdd extends Add {
    def subtract(b: Int): Int = add(-b)
    def somethingElse(b: Int): Int = 5
  }

  class Calculator(a: Int) extends Subtract with Add {
    Calculator.calculatorsCreated += 1

    def add(b: Int): Int = a + b
    override def subtract(b: Int): Int = a - b
  }

}
