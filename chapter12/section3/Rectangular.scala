package chapter12.section3

trait Rectangular {
  // Abstract methods that other classes implement
  def topLeft: Point
  def bottomRight: Point

  // Concrete methods that all classes use
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
}