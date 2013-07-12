class Example1 {
  var capital = Map("US" -> "Washington", "France" -> "Paris")
  capital += ("Japan" -> "Tokyo")
  println(capital("France"))
}