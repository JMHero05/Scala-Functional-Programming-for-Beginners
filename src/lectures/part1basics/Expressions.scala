package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 // RIGHT SIDE OF '=' IS KNOWN AS EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN.

  // EVERYTHING IN SCALA IS AN EXPRESSION!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // SIDE EFFECTS: println(), whiles, reassigning

  // CODE BLOCKS

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // 1. Difference between "hello world" vs println("hello world")
  // 2 & 3. What's the value of...?

  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

  // ANSWERS:
  // 1. "hello world" is a value with type of String (String Literal)
  //    println("hello world") is an expression that is a side-effect. Side-Effects return and are type of Unit '()'
  //    It has a side effect of printing the String to the console.

  // 2. someValue is type of Boolean. This one in particular returns true.

  // 3. someOtherValue is a Code Block that is type of Int since
  // it will return 42 because that is the final value of the Code Block.
}
