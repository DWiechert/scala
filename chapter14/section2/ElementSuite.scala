package chapter14.section2

import org.scalatest.Suite
import chapter14.section1.Element.elem

/**
 * Need to add scala test jar to classpath. Tests need to start with 'test'.
 * <p/>
 * Run with: (new ElementSuite).execute()
 */
class ElementSuite extends Suite {
  def testUniformElement() {
    val ele = elem('x', 2, 3)
    assert(ele.width === 3) // Triple equals provided by scala test for error message
  }
}