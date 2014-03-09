package chapter9.section5

object Example1 {
  var assertionsEnabled = true

  def myAssert(predicate: () => Boolean) =
    if (assertionsEnabled && !predicate())
      throw new AssertionError

  myAssert(() => 5 > 3) // Looks ugly

  def byNameAssert(predicate: => Boolean) = // Passing a by-name type here won't evaluate until line 13 so no side effects while calling
    if (assertionsEnabled && !predicate)
      throw new AssertionError

  byNameAssert(5 > 3) // Looks nice and clean
}