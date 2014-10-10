package chapter14.section1

import Element.elem

/**
 * This class was constructed over all sections of chapter 10.
 */
abstract class Element {
  /**
   * The contents of the Element.
   */
  def contents: Array[String]

  /**
   * The height of the contents.
   */
  def height: Int = contents.length

  /**
   * The width of the contents.
   */
  def width: Int = if (height == 0) 0 else contents(0).length()

  /**
   * Adds the contents of the provided Element below the contents of this Element.
   */
  def above(that: Element): Element = {
    val this1 = this widen that.width
    val that1 = that widen this.width
    
    // Asserting both widths are the same
    assert(this1.width == that1.width)
    
    elem(this1.contents ++ that1.contents)
  }

  /**
   * Widens this Element by padding spaces on either side to get the specified width.
   */
  def widen(w: Int): Element = {
    if (w <= width) this
    else {
      val left = elem(' ', (w - width) / 2, height)
      val right = elem(' ', w - width - left.width, height)
      left beside this beside right
      // Ensuring the widths are the same
    } ensuring (w <= _.width)
  }

  /**
   * Adds the contents of the provided Element beside the contents of this Element.
   */
  def beside(that: Element): Element = {
    val this1 = this heighten that.height
    val that1 = that heighten this.height
    elem(
      for ((thisLine, thatLine) <- this1.contents zip that1.contents)
        yield thisLine + thatLine)
  }

  /**
   * Heightens this Element by padding spaces on top and bottom to get the specified height.
   */
  def heighten(h: Int): Element = {
    if (h <= height) this
    else {
      val top = elem(' ', width, (h - height) / 2)
      val bot = elem(' ', width, h - height - top.height)
      top above this above bot
    }
  }

  override def toString = contents mkString "\n"
}

/**
 * Factory class for Element.
 */
object Element {
  /**
   * Implementation of Element that takes the contents in its constructor.
   */
  private class ArrayElement(val contents: Array[String]) extends Element

  /**
   * Implementation of Element that holds only one line.
   */
  private class LineElement(s: String) extends Element {
    val contents = Array(s)
    override def width = s.length
    override def height = 1
  }

  /**
   * Implementation of Element where every character is the same.
   */
  private class UniformElement(ch: Char, override val width: Int, override val height: Int) extends Element {
    private val line = ch.toString * width
    def contents = Array.fill(height)(line)
  }

  /**
   * Creates an Element from an Array.
   */
  def elem(contents: Array[String]): Element = new ArrayElement(contents)

  /**
   * Creates an Element from a Char.
   */
  def elem(chr: Char, width: Int, height: Int): Element = new UniformElement(chr, width, height)

  /**
   * Creates an Element from a String.
   */
  def elem(line: String): Element = new LineElement(line)
}