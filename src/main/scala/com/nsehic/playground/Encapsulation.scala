package com.nsehic.playground

object Encapsulation {

  def example(): Unit = {
    val person = new Person(name = "Nermin")

    // by default, all class fields are private, meaning this won't work
    // if you need access to this field, you should expose a method that can retrieve this value
//    println(person.name)

    println(Calculator.add(5, 12))
  }

  object Calculator extends Add with Subtract

  trait Add {
    def add(a: Int, b: Int): Int = a + b
  }

  trait Subtract {
    def substract(a: Int, b: Int): Int = a - b
  }

  // By default, all fields are private val
  // To make them public, you can explicitly type val instead of private val
  class Person(private val name: String)

}
