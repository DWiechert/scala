package chapter14.section6

import org.scalatest.WordSpec
import org.scalatest.prop.Checkers
import org.scalacheck.Prop._
import chapter14.section1.Element.elem

/**
 * Need to add scala test jar to classpath.
 * <p/>
 * Run with: (new ElementSpec).execute()
 */
class ElementSpecCheckers extends WordSpec with Checkers {
  // ScalaCheck will generate hundreds of w's and h's for these checks to see if there are any scenarios
  // that these properties do not hold true.
  
  "elem result" must {
    "have passed width" in {
      // For each w > 0, the passed in w must equal the width
      check((w: Int) => w > 0 ==> (elem('x', w, 3).width == w))
    }
    
    "have passed height" in {
      // For each h > 0, the passed in h must equal the height
      check((h: Int) => h > 0 ==> (elem('x', 2, h).height == h))
    }
  }
}