import scala.io.Source

def widthOfLength(s: String) = s.length.toString.length

if (args.length > 0) {
  val lines = Source.fromFile(args(0)).getLines().toList

  /* OO way of thinking 
   * var maxWidth = 0
   * for (line <- liens)
   * maxWidth = maxWidth.max(widthOfLength(line))
   */

  // Functional way of thinking
  val longestLine = lines.reduceLeft(
    (a, b) => if (a.length > b.length) a else b)

  val maxWidth = widthOfLength(longestLine)

  for (line <- lines) {
    val numSpaces = maxWidth - widthOfLength(line)
    val padding = " " * numSpaces
    println(padding + line.length + " | " + line)
  }
} else
  Console.err.println("Please enter a filename.")