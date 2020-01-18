package ca.mcit.scala.oop

trait Shape {
  def draw():String
}

object Shape {
  def create(shapeType: String, x: Int, y: Int): Shape = {
    shapeType match {
      case "circle" => new Circle(x)
      case "cylinder" => new Cylinder(x,y)
      case "square" => new Square(x)
      case "squarecuboid" => new SquareCuboid(x,y)
      case _ => null
    }
  }
}
