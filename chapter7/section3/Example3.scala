// Filtering in the for-expression
val filesHere = (new java.io.File(".")).listFiles
for (file <- filesHere if file.getName.endsWith(".scala"))
  println(file)

// Filtering for each file
for (file <- filesHere)
  if (file.getName.endsWith(".scala"))
    println(file)

// Filtering out directories and scala files
for {
  file <- filesHere
  if file.isFile
  if file.getName.endsWith(".scala")
} println(file)