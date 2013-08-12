package chapter4.section1

class ChecksumAccumulator3 {
  private var sum = 0
  def add(b: Byte) { sum += b } // Leave off return type and curly brace it so it looks like a procedure
  def checksum(): Int = ~(sum & 0xFF) + 1
}