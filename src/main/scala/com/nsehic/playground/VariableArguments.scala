package com.nsehic.playground

object VariableArguments {
  def example(): Unit = {
    val c1 = MyCollection()
    println(c1)

    val c2 = MyCollection(1, 2, 3, 4, 5)
    println(c2)
  }

  object MyCollection {
    def apply(ints: Int*): Seq[Int] =
      ints
  }

}
