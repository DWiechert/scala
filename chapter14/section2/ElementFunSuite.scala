package chapter14.section2

import org.scalatest.FunSuite
import chapter14.section1.Element.elem

/**
 * Need to add scala test jar to classpath. Tests need not to start with 'test' because of the FunSuite.
 * <p/>
 * Run with: (new ElementFunSuite).execute()
 */
class ElementFunSuite extends FunSuite {
  test("elem result should have passed width") {
    val ele = elem('x', 2, 3)
    assert(ele.width === 2) // Triple equals provided by scala test for error message
    expect(2) {
      ele.width
    }
    intercept[IllegalArgumentException] {
      elem('x', -2, 3)
    }
  }
}