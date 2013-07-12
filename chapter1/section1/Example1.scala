package chapter1.section1

object Example1 extends App {
	var capital = Map("US" -> "Washington", "France" -> "Paris")
	capital += ("Japan" -> "Tokyo")
	println(capital("France"))
}