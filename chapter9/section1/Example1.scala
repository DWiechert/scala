package chapter9.section1

/**
 * Simple way of different ways to search for files in the current directory.
 */
object Example1 {
  private def filesHere = (new java.io.File(".")).listFiles()

  /**
   * Find files that end with the specified query.
   */
  def filesEnding(query: String) =
    for (file <- filesHere; if file.getName().endsWith(query))
      yield file

  /**
   * Find files that contain the specified query.
   */
  def filesContaining(query: String) =
    for (file <- filesHere; if file.getName().contains(query))
      yield file

  /**
   * Find files based on a regex query.
   */
  def filesRegex(query: String) =
    for (file <- filesHere; if file.getName().matches(query))
      yield file
}