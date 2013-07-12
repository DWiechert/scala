package chapter1.section1

import java.math.BigInteger

object Example3 extends App {
	def factorial(x: BigInteger): BigInteger = {
		if (x == BigInteger.ZERO)
			BigInteger.ONE
		else
			x.multiply(factorial(x.subtract(BigInteger.ONE)))
	}
	
	println(factorial(BigInteger.valueOf(30)))
}