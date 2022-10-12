package com.nsehic.playground

object PatternMatchingAndPartialFunctions {

  def example(): Unit = {
    // Partial functions
    higherOrderFunction {
      case 4 => Console.CYAN + 4 + Console.RESET
      case 9 => Console.MAGENTA + 9 + Console.RESET
      case other => other.toString
    }

    // Guards
    higherOrderFunction {
      case x if x % 2 == 0 => Console.GREEN + x + Console.RESET
      case other => Console.RED + other + Console.RESET
    }

    matchExample()
    listDestructuringExample()
  }

  def listDestructuringExample(): Unit = {
    val List(_, _, third, fourth, rest @ _*) = List(1,2,3,4,5,6,7,8,9)

    println(third)
    println(fourth)
    println(rest)
  }


  def matchExample(): Unit = {
    val result =
      List(1,2,3,4,5,6,7,8,9) match {
        case List(_, _, third, fourth, _*) if third == fourth - 1 => true
        case _ => false
      }

    println(result)

    val list = List(1,2,3,4,5,6,7,8,9)
    val result2 = list match {
      case List(_, _,  third, fourth, _*) if third == fourth - 1 => true
      case _ => false
    }

    println(result2)
  }

  def higherOrderFunction(f: Int => String): Unit = {
    var acc = 0
    while (acc < 10) {
      println(f(acc))
      acc += 1
    }
  }

}
