// From this directory: scalac ChecksumAccumulator1.scala Summer1.scala
// scala Summer1 of love
object Summer1 {
  def main(args: Array[String]) {
    for (arg <- args)
      println(arg + ": " + ChecksumAccumulator1.calculate(arg))
  }
}