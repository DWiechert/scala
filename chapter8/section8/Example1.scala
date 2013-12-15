def echo(args: String*) = for (arg <- args) println(arg)

echo()
echo("one")
echo("hello", "world")

val arr = Array("What's", "up", "doc?")
echo(arr: _*) // Tells compiler to pass each element of arr as its own argument instead of the array as a single argument