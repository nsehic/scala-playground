package com.nsehic.playground

object Exceptions {
  def example(): Unit = {
    val result =
      try 1 / 0
      catch {
        case e: ArithmeticException => -1
      }

    println(result)

  }
}
