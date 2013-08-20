package chapter6

/**
 * This class was constructed over all sections of chapter 6.
 */
class Rational(n: Int, d: Int) {
  require(d != 0)

  val numer = n
  val denom = d

  // All auxiliary constructors must call either the primary constructor
  // or another auxiliary constructor which eventually calls the primary
  def this(n: Int) = this(n, 1) // auxiliary constructor

  override def toString = n + "/" + d

  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def lessThan(that: Rational) =
    numer * that.denom < that.numer * denom

  def max(that: Rational) =
    if (lessThan(that)) that else this
}