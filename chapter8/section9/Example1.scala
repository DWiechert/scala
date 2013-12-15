def boom(x: Int): Int =
  if (x == 0) throw new Exception("boom!")
  else boom(x - 1) + 1 // Not tail recursive because of increment

boom(3) // Multiple stack traces are provided because it isn't tail recursive