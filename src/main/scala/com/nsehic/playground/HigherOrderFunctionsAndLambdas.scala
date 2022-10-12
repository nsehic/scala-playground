package com.nsehic.playground

object HigherOrderFunctionsAndLambdas {
  def example(): Unit = {
    val f1: Int => String = render
//    val f2 = render _
//    val f3 = x => render(x)
//    val f4 = render(_)

    higherOrderFunction(f1)
//    higherOrderFunction(f2)
//    higherOrderFunction(f3)
//    higherOrderFunction(f4)

//    higherOrderFunction(render)
//    higherOrderFunction(render _)
//    higherOrderFunction(x => render(x))
//    higherOrderFunction(render(_))

    sortExample()
    advancedExample()
  }


  def render(n: Int): String =
    Console.YELLOW + n + Console.RESET

  def higherOrderFunction(f: Int => String): Unit = {
    var acc = 0
    while (acc < 10) {
      println(f(acc))
      acc += 1
    }
  }

  def advancedExample(): Unit = {
    higherOrderFunction { x =>
      Console.MAGENTA + x + Console.RESET
    }
  }

  def sortExample(): Unit = {
//    println(
//      List(6, 2, 5, 9, 8).sortWith((a, b) => a <= b)
//    )

    println(
      List(6, 2, 5, 9, 8).sortWith(_<=_)
    )
  }
}
