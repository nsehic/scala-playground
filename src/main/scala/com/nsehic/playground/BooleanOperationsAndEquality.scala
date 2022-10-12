package com.nsehic.playground

object BooleanOperationsAndEquality {
  def example(): Unit = {

    val isEqual = 1 == 1
    val isNotEqual = 1 != 1
    val isLessThan = 1 < 1
    val isGreaterThan = 1 > 1
    val isGreaterOrEqualThan = 1 >= 1
    val isLessOrEqualThan = 1 <= 6

    println(isEqual)
    println(isNotEqual)
    println(isLessThan)
    println(isGreaterThan)
    println(isGreaterOrEqualThan)
    println(isLessOrEqualThan)

    // Comparing Strings
    // In Java you need to call .equals to compare objects rather than just
    // referential equality. In Scala == delegates to .equals so this is acceptable
    val stringEquals = "test" == "test"

    println(stringEquals)

    // Booleans
    println(!true)
    println(true || false)
    println(true && false)

  }

}
