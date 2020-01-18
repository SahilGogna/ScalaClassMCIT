package ca.mcit.scala.oop

class SquareCuboid( val side:Int,private val height: Int) extends Square(side){
  override def draw(): String = s"This is a square with area ${area()}"

  override def area(): Double = 2 * (super.area()) + 4 * (side * height)

  def volume(): Double = super.area() * height
}
