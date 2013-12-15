var increase = (x: Int) => {
  println("We")
  println("are")
  println("here!")
  x + 1
}
println(increase(10))

increase = (x: Int) => x + 9999
println(increase(10))