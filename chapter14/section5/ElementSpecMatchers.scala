package chapter14.section5

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import chapter14.section1.Element.elem

/**
 * Need to add scala test jar to classpath.
 * <p/>
 * Run with: (new ElementSpec).execute()
 */
class ElementSpecMatchers extends FlatSpec with ShouldMatchers {
  "A Uniform Element" should
    "have a width equal to the passed value" in {
    val ele = elem('x', 2, 3)
    ele.width should be (2)
  }
  
  it should "have a height equal to the passed value" in {
    val ele = elem('x', 2, 3)
    ele.height should be (3)
  }
  
  it should "throw an IAE if passed a negative width" in {
    evaluating {
      elem('x', -2, 3)
    } should produce [IllegalArgumentException]
  }
}