// Hexadecimal, base 16, 0-9 and A-F, begin with 0x or 0X
val hex = 0x5
val hex2 = 0x00FF
val magic = 0xcafebabe
println(hex)
println(hex2)
println(magic)

// Octal, base 8, 0-7, begin with 0
val oct = 035
val nov = 0777
val dec = 0321
println(oct)
println(nov)
println(dec)

// Decimal, base 10, 0-9, begins with a non-zero digit
val dec1 = 31
val dec2 = 255
val dec3 = 20
println(dec1)
println(dec2)
println(dec3)

// Long and Int, longs end with L or l
val prog = 0XCAFEBABEL
val tower = 35L
val of = 31l
println(prog)
println(tower)
println(of)

// Short and Byte
val little: Short = 367
val littler: Byte = 38
println(little)
println(littler)

// Float and Double, decimal digits, optionally containing a decimal point, and optionally followed by an E or e, floats end with D or d
val big = 1.2345
val bigger = 1.2345e1
val biggerStill = 123E45
val littlef = 1.2345F
val littleBigger = 3e5f
val anotherDouble = 3e5
val yetAnother = 3e5D
println(big)
println(bigger)
println(biggerStill)
println(littlef)
println(littleBigger)
println(anotherDouble)
println(yetAnother)

// Character
val a = 'A'
val c = '\101'
val d = '\u0041'
val f = '\u0044'
println(a)
println(c)
println(d)
println(f)

// String
val hello = "hello"
val escapes = "\\\"\'"
val rawStrings = """Welcome to Ultamix 3000.
					Type "HELP" for help."""
val rawStringsMargin = """|Welcome to Ultamix 3000.
						  |Type "HELP" for help.""".stripMargin
println(hello)
println(escapes)
println(rawStrings)
println(rawStringsMargin)

// Symbols
def printSymbolName(r: Symbol) {
  println(r.name)
}
printSymbolName('aSymbol)

// Boolean
val bool = true
val fool = false
println(bool)
println(fool)