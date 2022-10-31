package com.nsehic.playground

object AlgebraicDataTypes {

  def example(): Unit = {
    val p: Entity =
      Entity.Person(
        name = "Nermin",
        age = 25
      )

    val e: Entity =
      Entity.Employee(
        id = 1000,
        person = Entity.Person(
          name = "Leah",
          age = 22
        )
      )

    println(e)
    println(shouldPaySalary(p))
    println(shouldPaySalary(e))

    optionExamples()
    entityPersonListExample()

    println("—" * 50)
    println(age(p))
    println(age(e))
    println(age(Entity.Unidentified))

    println("—" * 50)
    age(p)
      .map(_ + 1)
      .map(_.toString)
      .foreach(println)

    println("—" * 50)

    val sumOfAllAges: Option[Int] =
      for {
        ageE <- age(e)
        ageP <- age(p)
      } yield ageE + ageP

    println(sumOfAllAges)

    println("—" * 50)

    val averageAge: Option[Double] =
      sumOfAllAges.map(_.toDouble).map(_ / 2)

    sumOfAllAges.foreach(println)
    averageAge.foreach(println)

  }

  sealed abstract class Entity
  object Entity {
    final case class Person(name: String, age: Int) extends Entity
    final case class Employee(id: Int, person: Person) extends Entity
    case object Unidentified extends Entity
  }


  def shouldPaySalary(e: Entity): Boolean = e match {
    case _: Entity.Employee => true
    case _ => false
  }


  def optionExamples(): Unit = {
    val option1: Option[Int] = Some(1000)
    println(option1)
    println("Hello There")

    val option2: Option[Int] = None
    println(option2)

    def addOneAndConvertToString(option: Option[Int]): Option[String] =
      option match {
        case Some(n) => Some((n + 1).toString)
        case None => None
      }

    println(addOneAndConvertToString(option1))
  }

  def age(e: Entity): Option[Int] = e match {
    case Entity.Employee(_, Entity.Person(_, result)) => Some(result)
    case Entity.Person(_, result) => Some(result)
    case Entity.Unidentified => None
  }

  def entityPersonListExample(): Unit = {
    val people: List[Entity.Person] =
      List(
        Entity.Person("Alice", 25),
        Entity.Person("Bobby", 26)
      )

    println(people.find(_.name.toLowerCase.startsWith("bob")))
    println(people.find(_.age % 2 != 0))
  }

  def refactoring(): Unit = {
    println("Refactoring here")
  }
}
