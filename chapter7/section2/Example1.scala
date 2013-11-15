// While loop that calculates the GCD of two longs
def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

// Recursive way to calculate GCD of two longs
def gcd(x: Long, y: Long): Long =
  if (y == 0) x else gcd(y, x % y)

// Do/while loop to echo liens read from standard input
var line = ""
do {
  line = readLine()
  println("Read: " + line)
} while (line != "")