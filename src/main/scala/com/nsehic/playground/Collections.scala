package com.nsehic.playground

import scala.collection.mutable

object Collections {

  def example(): Unit = {
    rangeExample()
  }

  def arrayExample(): Unit = {
    val fruits = Array("apple", "orange", "banana");
//    println(fruits.apply(1))
    println(fruits(2))

    fruits.foreach(println)
    fruits.mapInPlace(_.reverse).foreach(println)
//    fruits.map(_.reverse).foreach(println)
    fruits.foreach(println)
  }

  def mutableCollectionExample(): Unit = {
    val sequence = mutable.ArraySeq(1,2,3)
    sequence.foreach(println)
  }

  def collectionsExample(): Unit = {
    // Sequences are ordered collections and a immutable
    // The default type of Seq is actually a List
    val sequence = Seq(1, 2, 3)

    val list = List(1, 2, 3)

    // Indexed Sequences guarantee O(1) time lookups by index
    // The default type of IndexedSeq is actually a Vector
    val indexedSequence = IndexedSeq(1, 2, 3)

    val vector = Vector(1, 2, 3)

    // Unordered and cannot contain any duplicates
    val set = Set(1, 2, 3)
  }

  def flatMapExample(): Unit = {
    List(1, 2, 3).flatMap {n =>
      if(n % 2 == 0)
        List.empty
      else
        List(n)
    }.foreach(println)
  }

  def mapExample(): Unit = {
    val map = Map(
      1 -> "Nermin",
      2 -> "Emir",
      3 -> "Leah"
    )

    val result = map.map { tuple =>
      val key = tuple._1
      val value = tuple._2

      key -> value.toLowerCase
    }

    println(result)
  }

  def rangeExample(): Unit = {
    val exclRange = Range(start = 0, end = 10)
    exclRange.foreach(println)

    val inclRange = Range.inclusive(start = 0, end = 10)
    inclRange.foreach(println)


    val simpleExclRange = 0 until 10
    val simpleInclRange = 0 to 10

    simpleExclRange.foreach(println)
    simpleInclRange.foreach(println)
  }


}
