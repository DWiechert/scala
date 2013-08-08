// No side effects or vars
def formatArgs(args: Array[String]) = args.mkString("\n")

println(formatArgs(args))

val res = formatArgs(Array("zero", "one", "two"))
assert(res == "zero\none\ntwo")