package chapter9.section1

/**
 * Advanced way to search for files in the current directory.
 */
object Example2 {
  private def filesHere = (new java.io.File(".")).listFiles()

  /**
   * Find files based on the provided matcher function.
   */
  def filesMatching(matcher: (String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName()))
      yield file
  }

  def filesEnding(query: String) = filesMatching(_.endsWith(query))

  def filesContaining(query: String) = filesMatching(_.contains(query))

  def filesRegex(query: String) = filesMatching(_.matches(query))
}