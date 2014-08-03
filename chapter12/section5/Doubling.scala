package chapter12.section5

trait Doubling extends IntQueue {
  // Abstract override is only allowed in Traits
  abstract override def put(x: Int) = { super.put(2 * x) }
}