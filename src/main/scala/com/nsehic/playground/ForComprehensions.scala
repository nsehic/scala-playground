package com.nsehic.playground

object ForComprehensions {
  def example(): Unit = {
    for(i <- 0 to 9)
      println(i)

    val chessBoard =
      (for (c <- 'A' to 'H')
        yield for(n <- 0 to 8)
        yield c -> n).flatten

    val anotherChessBoard = ('A' to 'H').flatMap { c =>
      (0 to 8).map { n =>
        c -> n
      }
    }

    // example of a generator
    val betterChessBoard =
      for(c <- 'A' to 'H'; n <- 0 to 8) yield c -> n


    val filterInForComprehensions =
      for {
          c <- 'A' to 'H'
          n <- 0 to 8 if n % 2 == 0
      } yield c -> n

    filterInForComprehensions.foreach(println)
  }
}
