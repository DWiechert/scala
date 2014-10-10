// Exceptions have a return type of Nothing so you can use it in assigments
val half =
  if (n % 2 == 0)
    n / 2
  else
    throw new RuntimeException("n must be even")

// Try/Catch
// Note: Checked exceptions do NOT need to be caught or declared as throws on a method
try {
  val f = new java.io.FileReader("input.txt")
  // Use and close file
} catch {
  case ex: java.io.FileNotFoundException => // Handle missing file
  case ex: java.io.IOException           => // Handle other I/O error
}

// Try/Finally
val file = new java.io.FileReader("input.txt")
try {
  // Use the file
} finally {
  file.close() // Be sure to close the file
}

// Returning values in try/catch
def urlFor(path: String) =
  try {
    new java.net.URL(path)
  } catch {
    case e: java.net.MalformedURLException => new java.net.URL("http://www.scala-lang.org")
  }

// This results in 2 because of the return in the finally
def f(): Int = try { return 1 } finally { return 2 }

// This results in 1 because finally does not explicitlly return a value
def g(): Int = try { 1 } finally { 2 }