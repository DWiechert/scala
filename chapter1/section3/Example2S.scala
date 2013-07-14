package chapter1.section3

object Example2S extends App {
	val word = "somethingthathasAnuppercase"
	val wordHasUpperCase = word.exists(_.isUpper)
	println(wordHasUpperCase)
}