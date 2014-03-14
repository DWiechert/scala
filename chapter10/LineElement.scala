package chapter10

/**
 * Implementation of Element that holds only one line.
 */
class LineElement(s: String) extends Element {
  val contents = Array(s)
  override def width = s.length
  override def height = 1
}