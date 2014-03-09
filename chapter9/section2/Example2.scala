package chapter9.section2

/**
 * Advanced way to search through lists to find information using higher-order functions.
 */
object Example2 {
  def containsNeg(nums: List[Int]) = nums.exists(_ < 0)

  def containsOdd(nums: List[Int]) = nums.exists(_ % 2 == 1)
}