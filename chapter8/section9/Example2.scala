def bang(x: Int): Int =
  if (x == 0) throw new Exception("bang!")
  else bang(x - 1) // Tail recursive, as efficient as a while loop

bang(5) // Only one stack trace is provided because of the tail recursion