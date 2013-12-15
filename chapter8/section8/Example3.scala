def printTime(out: java.io.PrintStream = Console.out) = out.println("time = " + System.currentTimeMillis())
printTime()
printTime(Console.err)

def printTime2(out: java.io.PrintStream = Console.out, divisor: Int = 1) = out.println("time = " + System.currentTimeMillis() / divisor)
printTime2(out = Console.err)
printTime2(divisor = 1000)