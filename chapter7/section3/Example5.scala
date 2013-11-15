// Saving off variables from a for-expression
val filesHere = (new java.io.File(".")).listFiles

def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList

val scalaFiles =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file

println(scalaFiles)

val forLineLengths =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(".*for.*")
  } yield trimmed.length

println(forLineLengths)