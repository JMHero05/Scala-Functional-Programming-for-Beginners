package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE

  // COMPILER CAN INFER TYPES

  val aString: String = "hello"
  val anotherString = "goodbye"
  println(aString)

  val aBoolean: Boolean = false

  val aChar: Char = 'a'

  val anInt: Int = x

  val aShort: Short = 4613
  val aLong: Long = 4613444444444444444L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // VARIABLES
  var aVariable: Int = 4

  aVariable = 5 // side effects
}
