package ca.mcit.scala.oop

object AppStarter extends App {
  val circle = new Circle(3)
  val cylinder = new Cylinder(3,3)
  val square = new Square(4)
  val cuboidSquare = new SquareCuboid(4,4)

  val newCircle = Shape.create("circle",1,1)
  val newCylinder = Shape.create("cylinder",3,2)
  val newSquare = Shape.create("square",2,1)
  val newSquareCuboid = Shape.create("squarecuboid",4,2)

  render(circle)
  render(cylinder)
  render(square)
  render(cuboidSquare)

  def render(shape:Shape):Unit = {
    println(shape.draw())
  }
}
