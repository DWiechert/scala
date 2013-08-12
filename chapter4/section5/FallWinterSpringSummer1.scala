// From this directory: scalac ChecksumAccumulator1.scala FallWinterSpringSummer1.scala
// scala FallWinterSpringSummer1
object FallWinterSpringSummer1 extends App { // Application got deprecated to App
  for (season <- List("fall", "winter", "spring"))
    println(season + ": " + ChecksumAccumulator1.calculate(season))
}