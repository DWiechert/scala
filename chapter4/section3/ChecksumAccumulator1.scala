package chapter4.section3

import scala.collection.mutable.Map

// When a singleton object shares the same name with a class, it is called that class's companion object
// You must define both the class and its companion object in the same source file
// The class is called the companion class of the singleton object
// A class and its companion object can access each other's private members
class ChecksumAccumulator1 {
  private var sum = 0
  def add(b: Byte) { sum += b } // Leave off return type and curly brace it so it looks like a procedure
  def checksum(): Int = ~(sum & 0xFF) + 1
}

// There are no static members in Scala, only singleton objects
// Singleton objects are of type object instead of class
object ChecksumAccumulator1 {
  private val cache = Map[String, Int]()

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator1 // This is the class because objects are not instantiated
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}