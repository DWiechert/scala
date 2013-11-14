// Imperative style of if
var filename = "default.txt"
if (!args.isEmpty)
  filename = args(0)
  
// Without using any vars because if's return a value
val filename =
  if (!args.isEmpty) args(0)
  else "default.txt"