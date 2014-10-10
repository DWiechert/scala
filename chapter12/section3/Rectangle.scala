package chapter12.section3

class Rectangle(val topleft: Point, val bottomright: Point) extends Rectangular {
  // Defining the abstract trait methods
  def topLeft = topleft
  def bottomRight = bottomright

  // Other methods we want to add
}