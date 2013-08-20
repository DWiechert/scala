package chapter6

/**
 * This class was constructed over all sections of chapter 6.
 */
class Rational(n: Int, d: Int) {
  require(d != 0)

  val numer = n
  val denom = d

  override def toString = n + "/" + d

  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
}