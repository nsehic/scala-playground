package com.nsehic.playground

import scala.language.implicitConversions

object Implicits {

  final implicit class AnyOps(private val self: Any) extends AnyVal {
    def styled(style: String): String = style + self + Console.RESET

    def red: String = styled(Console.RED)
    def green: String = styled(Console.GREEN)
    def blue: String = styled(Console.BLUE)
  }

  final case class Apple(weightInGrams: Int, color: String)
  final case class Orange(weightInGrams: Int)

  def acceptOrange(orange: Orange): Unit = {
    println(orange)
  }

//  implicit def appleCanBeUsedAsOrange(apple: Apple): Orange = {
//    Orange(apple.weightInGrams)
//  }

//  implicit def AppleWrapper(apple: Apple): AppleWrapper =
//    new AppleWrapper(apple)

  final implicit class AppleWrapper(apple: Apple) {
    def toOrange: Orange =
      Orange(apple.weightInGrams)
  }

  def example(): Unit = {
    val apple = Apple(weightInGrams = 300, color = "red")
    acceptOrange(apple.toOrange)

    println(List(1, 2, 3).red)
    println(List(1, 2, 3).green)
    println(List(1, 2, 3).blue)
  }
}
