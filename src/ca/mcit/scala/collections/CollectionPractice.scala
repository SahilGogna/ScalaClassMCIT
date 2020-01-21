package ca.mcit.scala.collections

object CollectionPractice extends App {
  val numbers = List(1,2,3,4)
  println(numbers)
  println(Nil) // same as List()
  println(s"Non-Empty: ${numbers.nonEmpty}")
  println(s"IsEmpty: ${numbers.isEmpty}")
  println(s"Head: ${numbers.head}")
  println(s"Tail: ${numbers.tail}")
  println(s"Last: ${numbers.last}")
  println(s"Init: ${numbers.init}")


}
