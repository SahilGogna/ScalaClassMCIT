package ca.mcit.scala.oop

class Cylinder(private val h: Int, r: Int) extends Circle(r) {
  override def draw(): String = s"This is cylinder with area ${area()}"

  override def area(): Double = (2*super.area()) + ( 2 * r * h * Circle.pi )

  def volume(): Double = super.area() * h
}
