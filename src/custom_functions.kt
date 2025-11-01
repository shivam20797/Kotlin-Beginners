/**
 * Topic: Functions in Kotlin
 * Author: Aakash
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

    println(sum(a, b))
    println(sub(a, b))
    println(multi(a, b))


    // Using default arguments
    println(arithmeticOper(a, b))
    println(arithmeticOper(a = a, b = b)) // Named arguments example

    // Function reference (::functionName)
    val sumFun = ::sum
    println(sumFun(a,b))

}

/**
 * Function with return type Int and default argument
 */

fun sum(a: Int, b: Int=20): Int {
    return a + b
}

fun sub(a: Int, b: Int): Int {
    return a - b
}

/**
 * Overloaded function (same name, different parameters)
 */

fun sub(a: Int, b: Int,c: Int): Int {
    return a - b
}

/**
 * Expression body function
 * (for single-line logic, no need for return or curly braces)
 */

fun multi(a: Int, b: Int) = a*b


/**
 * Function using `when` expression
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
// 2️⃣ Functions can have default parameter values.
// 3️⃣ Named arguments let you specify which parameter you’re passing.
// 4️⃣ You can store function references using `::functionName`.
// 5️⃣ Function overloading works like Java.
//
// 🆚 Java Equivalent Example:
//
// public static int sum(int a, int b) {
//     return a + b;
// }
//
// In Kotlin:
// fun sum(a: Int, b: Int): Int = a + b
// --------------------------------------------------


