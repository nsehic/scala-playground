package com.nsehic.playground

object DataStructures {
  def example(): Unit = {
    val person1 = Person("Nermin", 25)
    val person2 = Person("Nermin", 25)

    println(person1)
    println(person2)
    println(person1 == person2)

    // You can pattern match on case classes
    val Person(n, a) = person1
    println(n)
    println(a)

    // Since equality is possible with case classes
    // if you put them in a set, duplicates will be removed (as expected)
    val personSet = Set(person1, person1, person1)
    println(personSet)

    copyExample()
  }

  def copyExample(): Unit = {
    // since case classes are immutable, you need to copy them inorder
    // to change data

    val person1 = Person("Nermin", 25)
    val person2 = person1.copy("Nermin", 25)

    // We have copied the object with the same data, so equality will still pass
    println(person1 == person2) // true

    // We have copied the object but with different data, so equality will NOT pass
    val person3 = person2.copy("Leah", 22)
    println(person1 == person3) // false
  }

  // Inheritance is not disabled for case classes
  // Therefore it's a convention to make them final
  final case class Person(name: String, age: Int)

}
