package chapter10

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
  def width: int = if (height == 0) 0 else contents(0).length()

  /**
   * Adds the contents of the provided Element below the contents of this Element.
   */
  def above(that: Element): Element = elem(this.contents ++ that.contents)

  /**
   * Adds the contents of the provided Element beside the contents of this Element.
   */
  def beside(that: Element): Element = {
    // Imperative way to concatenate arrays
    //    val contents = new Array[String](this.contents.length)
    //    for (i <- 0 until this.contents.length)
    //      contents(i) = this.contents(i) + that.contents(i)
    //    new ArrayElement(contents)

    // Functional way to concatenate arrays
    elem(
      for (
        (thisLine, thatLine) <- this.contents zip that.contents
      ) yield thisLine + thatLine)
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