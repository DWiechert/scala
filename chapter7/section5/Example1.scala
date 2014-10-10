val firstArg = if (args.length > 0) args(0) else ""

// Directly printing on the match
firstArg match {
  case "salt"  => println("pepper")
  case "chips" => println("salsa")
  case "eggs"  => println("bacon")
  case _       => println("huh?")
}

// Yielding a result from the match
val friend =
  firstArg match {
    case "salt"  => "pepper"
    case "chips" => "salsa"
    case "eggs"  => "bacon"
    case _       => "huh?"
  }
println(friend)