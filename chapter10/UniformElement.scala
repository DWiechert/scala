package chapter10

/**
 * Implementation of Element where every character is the same.
 */
class UniformElement(ch: Char, override val width: Int, override val height: Int) extends Element {
  private val line = ch.toString * width
  def contents = Array.fill(height)(line)
}