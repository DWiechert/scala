List()
Nil
List("Cool", "tools", "rule")

val thrill = "Will" :: "fill" :: "until" :: Nil

List("a", "b") ::: List("c", "d")

println(thrill(2))
println(thrill.count(s => s.length == 4))
println(thrill.drop(2))
println(thrill.dropRight(2))
println(thrill.exists(s => s == "until"))
println(thrill.filter(s => s.length == 4))
println(thrill.forall(s => s.endsWith("l")))
thrill.foreach(s => println(s))
thrill.foreach(println)
println(thrill.head)
println(thrill.init)
println(thrill.isEmpty)
println(thrill.last)
println(thrill.length)
println(thrill.map(s => s + "y"))
println(thrill.mkString(", "))
// Deprecated and removed: println(thrill.remove(s => s.length == 4))
println(thrill.reverse)
/* Deprecated and removed: 
 * println(thrill.sort((s, t) =>
 *                       s.charAt(0).toLower <
 *                         t.charAt(0).toLower))
 */
println(thrill.tail)