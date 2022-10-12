package com.nsehic.playground

object Types {
  def example(): Unit = {

//    UNIT

    val unit1: Unit = ()
    val unit2: Unit = ()

    println(unit1)
    println(unit2)

//    NULLS
    val danger: Null = null
    println(danger)

//    BOOLEAN
    val yes: Boolean = true
    val no: Boolean = false

    println(yes)
    println(no)

//    NUMERIC
    val byteMin: Byte = Byte.MinValue
    val byteMax: Byte = Byte.MaxValue

    println(byteMin)
    println(byteMax)

    val shortMin: Short = Short.MinValue
    val shortMax: Short = Short.MaxValue

    println(shortMin)
    println(shortMax)

    val intMin: Int = Int.MinValue
    val intMax: Int = Int.MaxValue

    println(intMin)
    println(intMax)

    val longMin: Long = Long.MinValue
    val longMax: Long = Long.MaxValue

    println(longMin)
    println(longMax)

    val floatMin: Float = Float.MinValue
    val floatMax: Float = Float.MaxValue

    println(floatMin)
    println(floatMax)

    val doubleMin: Double = Double.MinValue
    val doubleMax: Double = Double.MaxValue

    println(doubleMin)
    println(doubleMax)


//    TYPE ALIAS
    type N = Int

    val age: N = 25
    println(age)

    class Person
    type _Person = Person

  }
}
