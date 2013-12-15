package chapter8.section1

object FindLongLines {
  def main(args: Array[String]): Unit = {
    val width = args(0).toInt
    for (arg <- args.drop(0)) {
      LongLines.processFile(arg, width)
    }
  }
}