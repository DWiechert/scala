package chapter14.section4

import junit.framework.TestCase
import junit.framework.Assert.assertEquals
import junit.framework.Assert.fail
import chapter14.section1.Element.elem

/**
 * Need to add junit jar to classpath.
 */
class ElementTestCase extends TestCase {
  def testUniformElement() {
    val ele = elem('x', 2, 3)
    assertEquals(2, ele.width)
    assertEquals(3, ele.height)
    try {
      elem('x', -2, 3)
      fail()
    } catch {
      case e: IllegalArgumentException => // expected
    }
  }
}