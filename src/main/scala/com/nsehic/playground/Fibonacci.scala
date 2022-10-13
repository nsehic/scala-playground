package com.nsehic.playground

object Fibonacci {
  def example(): Unit = {
    1 to 9 map fibonacci foreach println
  }

  def fibonacci(n: Int): Int = {
    @annotation.tailrec
    def loop(x: Int, acc: Int): Int = {
      if(x <= 1)
        acc
      else
        loop(x = x - 1, acc = acc * x)
    }

    loop(x = n, acc = 1)
  }
}
