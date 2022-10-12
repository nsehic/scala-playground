package com.nsehic.playground

object LoopsAndTailRecursion {
  def example(): Unit = {
//    loop()
    whileLoop()
  }

  @annotation.tailrec
  def loop(acc: Int = 0): Unit =
    if (acc < 10) {
      println(acc)

      loop(acc + 1)
    }

  def whileLoop(): Unit = {
    var acc = 0

    while(acc < 10) {
      println(acc)
      acc += 1
    }
  }
}
