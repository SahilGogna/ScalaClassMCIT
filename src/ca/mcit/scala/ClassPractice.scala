package ca.mcit.scala

object ClassPractice extends App {
  val person:Person = new Person("John",25)
  person.age = 30
  // age is mutable this is a side effect in scala
  // soln is case class
  println(person)

  val personV2 = PersonV2("John", 25)
  val perV2Updated = personV2.copy(age = 30).copy(name = "ASD")
  println(perV2Updated)

}
