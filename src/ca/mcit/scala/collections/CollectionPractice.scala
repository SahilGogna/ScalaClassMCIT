package ca.mcit.scala.collections

object CollectionPractice extends App {

  val numbers = List(1,2,3,4)

  def sum(input:List[Int]): Int = {
    def sumAcc(list:List[Int], acc:Int):Int = {
      if(list.isEmpty) acc
      else sumAcc(list.tail, acc+list.head)
    }
    sumAcc(input,0)
  }

  // without tail recursion
  def conSum(input:List[Int]): Int = if (input.isEmpty) 0 else input.head + sum(input.tail)

  //using pattern matching
  def patternSum(input:List[Int]): Int = input match {
    case Nil => 0
    case head :: tail => head + patternSum(tail)
  }

  println(s"Sum : ${sum(numbers)}")
  println(s"Sum without tail recursion : ${conSum(numbers)}")
  println(s"Pattern Sum : ${patternSum(numbers)}")

//  println(numbers)
//  println(Nil) // same as List()
//  println(s"Non-Empty: ${numbers.nonEmpty}")
//  println(s"IsEmpty: ${numbers.isEmpty}")
//  println(s"Head: ${numbers.head}")
//  println(s"Tail: ${numbers.tail}")
//  println(s"Last: ${numbers.last}")
//  println(s"Init: ${numbers.init}")


}
