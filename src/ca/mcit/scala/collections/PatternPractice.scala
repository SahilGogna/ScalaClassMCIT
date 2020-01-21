package ca.mcit.scala.collections

object PatternPractice extends App{

  val x = "A"
  x match {
    case "A" => println("Matched")
    case _ => println("Not Matched")
  }

  val john = Person("Mark", 22)

  john match {
    case Person("John",30) => println("Exact match found")
    case Person("John",_) => println("Partial match")
    case Person(name, age) if age < 31 => println(s"${name} has age less than 30")
   }

}

case class Person(name:String, age:Int)