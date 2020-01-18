package ca.mcit.scala.oop

class Square (private val side: Int) extends Shape {
  override def draw(): String = s"This is a square with area ${area()}"

  def area(): Double = Math.pow(side,2)
}
