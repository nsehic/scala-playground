package com.nsehic.playground

object Conditions {
  def example(): Unit = {
    val result = if (true && true) "good" else "bad"
    println(result)

    // If there's no else clause, the inferred type is `Any`
    val result2 = if (true && true) "good"
    println(result2)

    // If the else clause throws an exception, the `true` type can still be inferred
    // in this case `String`
    val result3 = if (true) "good" else throw new Exception
    println(result3)

    def wannaWatchAMovieOrGoForIceCream(
        movie: Boolean,
        iceCream: Boolean,
      ): String =
      if (movie && iceCream) {
        println("if(movie && iceCream)")
        "awesome"
      }
      else if (movie || iceCream) {
        println("if(movie || iceCream)")
        "still cool"
      }
      else
        "boring"

    wannaWatchAMovieOrGoForIceCream(movie = true, iceCream = true)

  }
}
