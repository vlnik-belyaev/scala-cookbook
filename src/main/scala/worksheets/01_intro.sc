"Hello, world".getClass.getName
val s = "Hello, world"
s.length
 "hello".foreach(println)
for (c <- "hello") println(c)
s.getBytes.foreach(println)
val result = "hello world".filter(_ != 'l')
val s1 = "Hello"
val s2 = "Hello"
val s3 = "H" + "ello"
s1 == s2
s1 == s3
val s4: String = null
s3 == s4
s4 == s3
val s1 = "Hello"
val s2 = "hello"
s1.toUpperCase == s2.toUpperCase
val foo = """This is
a multiline
String"""
val speech = """Four score and
|seven years ago""".stripMargin
val speech = """Four score and
#seven years ago""".stripMargin('#')
"hello world".split(" ")
"hello world".split(" ").foreach(println)
val s = "eggs, milk, butter, Coco Puffs"
s.split(",")
s.split(",").map(_.trim)
"hello world, this is Al".split("\\s+")
