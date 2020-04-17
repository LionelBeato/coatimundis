
// Welcome to Kotlin!

// Kotlin is a general purpose language that targets the JVM
// this means it can be interoperable with Java code

// functions and variables can be out in floating space, meaning they don't need to belong to another
// data structure

//as such Kotlin is not strictly class-based, and is much more general purpose than Java

// Kotlin data types are as followed

// Numbers: Byte, Short, Int, Long, Float, Double
// Boolean
// Char
// Array
// String

// All data types are declared capitalized

// TODO: list types

// like Java however, Kotlin requires an entry point for your code to run

fun myFunction(){
    println("this works fine")
  //  println(foo)
}


fun main(){
    // this function call is completely legal because Kotlin doesn't need to have things wrapped in classes
    // returnNothing()
    myFunction()
    println(foo)
    println(bar)
//    println("Hello World!")
    println(sum(4, 3))
//    println(myVal)
//    myVar = 1
}

// Kotlin code can have types inferred

var foo = "hello there"

// types can also be explicit

var bar: Int = 5

// like Java, functions can have an explicit return statement

//
//fun sum(a: Int, b: Int): Int {
//    return a + b
//}

// functions that don't return anything meaningful are said to return "Unit"
// "Unit" refers to a data type that is not meaningful

fun otherFunc(): Unit{
    println("this function doesn't return anything meaningful")
}

// there also a nothing type in Kotlin as well
// this value of Nothing will never exist
fun returnNothing(): Nothing {
    throw IllegalArgumentException("don't do that!")
}

var myString = ""

// null is not valid by default in Kotlin and as such all variables have defined values
// all functions implicitly return what's known as a Unit type

// in Kotlin, types are inferred but they can also be declared explicitly
// variables are defined in the following ways:

// val which is read only
// this is a little bit like const
val myVal = 3
// var which is reassignable
// this is a little bit like let or typical variables in Java
var myVar = 2
// const val which is immutable
// this is a little bit like static in Java
const val myConst = 6

// lambdas and functional programming are baked in by default into the language
// functions are treated like objects somewhat like in JavaScript
//val sum = { x: Int, y: Int -> x + y }
val sum = {x:Int, y:Int -> x + y }



