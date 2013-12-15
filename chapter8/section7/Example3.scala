def makeIncreaser(more: Int) = (x: Int) => x + more

val inc1 = makeIncreaser(1)
println(inc1(10))
val inc9999 = makeIncreaser(9999)
println(inc9999(10))