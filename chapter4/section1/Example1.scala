def f(): Unit = "This string gets lost."
def g() { "This string gets lost too." }
def h() = { "This string gets returned!" }

println(f())
println(g())
println(h())