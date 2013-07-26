package chapter2.section5

object Example2 extends App {
	var i = 0
	while (i < args.length) {
	  if (i != 0) {
	    print(" ")
	  }
	  print(args(i))
	  i += 1
	}
	println()
}