/**
 * Topic: Extension Functions in Kotlin
 * Author: Shivam
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 *
 * Extension functions allow you to **add new functions to existing classes**
 * without inheriting from them or modifying their code.
 * They improve code readability and reusability.
 *
 * This example demonstrates:
 * 1. Normal class function (`Calculator.sum`)
 * 2. Extension function on a class (`Calculator.sub`)
 * 3. Extension function on a standard library class (`String.isPalindrome`)
 */

fun main(){
    val calculator = Calculator()

    // Calling class function
    println(calculator.sum(1,2))

    // Calling extension function on Calculator
    println(calculator.sub(1,2))

    // Using extension function on String
    var str = "Madam";
    println(str.isPalindrome())
}


/**
 * Simple Calculator class
 */
class Calculator{
    fun sum(oneValue:Int,secondValue:Int): Int{
        return oneValue+secondValue
    }
}

/**
 * Extension function on Calculator class
 * Adds subtraction functionality
 */
fun Calculator.sub(oneValue:Int,secondValue:Int): Int{
    return oneValue-secondValue
}

/**
 * Extension function on String class
 * Checks if the string is a palindrome
 */
fun String.isPalindrome(): Boolean{
    return this.lowercase() == this.lowercase().reversed()
}

/**
 * 🧠 Notes:
 *
 * ✅ Extension functions:
 * - Allow adding new functionality to **existing classes**.
 * - Do **not** modify the original class; they are **syntactic sugar**.
 * - Can be applied to **standard library classes** like String, List, etc.
 *
 * ✅ Key Points:
 * - Syntax: `fun ClassName.functionName(...) { ... }`
 * - Can be called like a regular member function: `obj.functionName()`
 * - Can be used for both custom and library classes
 *
 * ✅ Example use cases:
 * - Add `isPalindrome()` to String
 * - Add utility functions to your own classes like `Calculator.sub()`
 * - Simplify repetitive tasks
 *
 * 🔑 Key Takeaway:
 * Extension functions make Kotlin code **cleaner, more expressive, and reusable**.
 */