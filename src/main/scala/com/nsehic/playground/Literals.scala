package com.nsehic.playground

object Literals {
  def example(): Unit = {
    val hex = 0xf
    println(hex)

    // Like Java, you can place underscores to improve readability of large numbers
    val largeNumber: Long = 23_128_908_398_431_798L
    println(largeNumber)

    // Characters
    println('a')
    println('A')
    println('\n')
    println('\u2500')

    // Strings
    println("Hello world")
    println(
      """
        Hello
        World
        |   123
        |""".stripMargin
    )

    // String interpolation
    val myAge = 25
    val myName = "Nermin"
    println(s"Hi, my name is $myName and I am $myAge years old")

    // String interpolation can include many expressions
    val timeTravelBy = 2
    println(s"I will be ${myAge + timeTravelBy} in $timeTravelBy years")
  }
}
