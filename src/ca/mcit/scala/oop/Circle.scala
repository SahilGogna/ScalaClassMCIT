package ca.mcit.scala.oop

class Circle(private val r: Int) extends Shape {
  override def draw(): String = s"This is a circle with area ${area()}"

  def area(): Double = Circle.pi * Math.pow(r,2)
}

object Circle{
  val pi:Double = 3.14
}