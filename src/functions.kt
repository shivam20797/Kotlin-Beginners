/**
 * Topic: Functions in Kotlin
 * Author: Shivam
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 * A function is a reusable block of code that performs a specific task.
 * Kotlin functions are defined using the `fun` keyword.
 *
 * Syntax:
 * fun functionName(arguments): ReturnType {
 *     // body
 * }
 *
 * If the function has only one expression, you can use expression body syntax:
 * fun sum(a: Int, b: Int) = a + b
 */

fun main(){
    val a = 10
    val b = 20

    // --------------------------------------------------
    // Calling functions
    // --------------------------------------------------

    var add = sum(a, b)

    // Function reference (::functionName)
    val sumRef = ::sum  // function reference

    println("Addition is : $add")
    println(sum(a, b))
    println(sum(a))  // Uses default b = 20
    println(sum(a = a,b = b)) // Named arguments
    println(sumRef(60,70)) // Using function reference


    println(sub(a, b))
    println(multi(a, b))


    println(arithmeticOper(a, b))   // default operation → returns 0
    println(arithmeticOper(a = a, b = b)) // Named arguments example

}

/**
 * Basic function with return type Int and default parameter
 */

fun sum(a: Int, b: Int=20): Int {
    return a + b
}

/**
 * Subtraction function
 */


fun sub(a: Int, b: Int): Int = a - b

/**
 * Overloaded function (same name, different parameters)
 */

fun sub(a: Int, b: Int, c: Int): Int =  a - b


/**
 * Expression body function
 * (for single-line logic, no need for return or curly braces)
 */


/**
 * Multiplication function using expression body
 */

fun multi(a: Int, b: Int) = a*b


/**
 * Function using `when` expression for different operations
 */


fun arithmeticOper(a: Int, b: Int,opr:String="nothing"): Int {
   return when(opr){
        "add" -> a+b
        "sub" -> a-b
        "mul" -> a*b
        "div" -> a/b
        "mod" -> a%b
        else -> 0
    }
}


// --------------------------------------------------
// 🧠 Notes:
// --------------------------------------------------
// 1️⃣ Default return type is `Unit` (similar to `void` in Java).
// 2️⃣ Default parameter values allow skipping arguments.
// 3️⃣ Named arguments let you specify which parameter you’re passing.
// 4️⃣ You can store function references using `::functionName`.
// 5️⃣ Function overloading works like in Java, but ensure all parameters are used.
// 6️⃣ Expression body syntax makes single-line functions concise.


