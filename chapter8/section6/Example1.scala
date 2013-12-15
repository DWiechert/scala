def sum(a: Int, b: Int, c: Int) = a + b + c
println(sum(1, 2, 3))

val a = sum _
println(a(1, 2, 3))

val b = sum(1, _: Int, 3)
println(b(2))
println(b(5))