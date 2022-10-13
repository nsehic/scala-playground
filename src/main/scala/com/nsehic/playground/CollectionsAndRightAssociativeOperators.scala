package com.nsehic.playground

object CollectionsAndRightAssociativeOperators {

  def example(): Unit = {
//    rightAssociativeOperators()
//    concatenateLists()
//    constructList()
//    vectorExample()
//    setExample()
//    mapExample()
    convertingCollectionTypes()
  }

  def rightAssociativeOperators(): Unit = {
    val list = List(1, 2, 3)
    println(list)

    println(0 :: list)
    println(list)

    println(0 +: list :+ 4)
  }

  def concatenateLists(): Unit = {
    val list = List(1, 2, 3)
    println(list)

    // Concatenate two lists
    println(list ::: List(4, 5, 6))

    println(list)
  }

  def vectorExample(): Unit = {
    val vector = Vector(1, 2, 3)
    println(vector)
    println(0 +: vector)
    println(vector :+ 4)

    // Concatenate two vectors
    println(vector ++ Vector(4, 5, 6))
  }

  def setExample(): Unit = {
    val set = Set(1, 2, 3)
    println(set + 0)
    println(set + 5)
  }

  def mapExample(): Unit = {
    val map = Map(1 -> "Nermin", 2 -> "Leah", 3 -> "Emir", 4 -> "Majida")
    println(map)
    println(map + (5 -> "Jesenko"))
    println(map + (5 -> "Dog"))

    // Concatenate two maps
    println(map ++ Map(5 -> "Cuddles"))
  }

  def constructList(): Unit = {
    println(1 :: 2 :: 3 :: Nil)
  }

  def convertingCollectionTypes(): Unit = {
    val list = List(1, 2, 3)

    // Converting a list to a vector
    println(list.to(Vector))

    val hashSet = {
      val result = new java.util.HashSet[Int]

      result.add(1)
      result.add(2)
      result.add(3)
      result.add(4)
      result.add(5)
      result.add(6)

      result
    }

    println(hashSet)

    // Conversion between Scala and Java Sets

    import scala.jdk.CollectionConverters._

    val scalaSet = hashSet.asScala
    println(scalaSet)

    val javaSet = scalaSet.asJava
    println(javaSet)
  }

}
