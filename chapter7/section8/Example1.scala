// Functional way to print a multiplication table

// returns a row as a Sequence
def makeRowSeq(row: Int) =
  for (col <- 1 to 10) yield {
    val prod = (row * col).toString
    val padding = " " * (4 - prod.length)
    padding + prod
  }

// Returns a row as a String
def makeRow(row: Int) = makeRowSeq(row).mkString

// Returns table as a String with one row per line
def multiTable() = {
  val tableSeq = // A Sequence of row Strings
    for (row <- 1 to 10)
      yield makeRow(row)

  tableSeq.mkString("\n")
}

println(multiTable())