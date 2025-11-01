/**
 * Topic: If, Else, and Expression in Kotlin
 * Author: Aakash
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 * This example explains:
 * - Basic `if` and `else` statements
 * - Nested `if-else` conditions
 * - Using `if` as an expression (Kotlin’s replacement for the ternary operator)
 * - Practical example: grading system
 */

fun main(){
    var a = 10
    var b = 20


    // ----------------------------------
    // 1️⃣ Basic If-Else Statement
    // ----------------------------------

    if(a > b){
        println("$a is greater than $b")
    }else{
        println("$b is greater than $a")
    }

    // ----------------------------------
    // 2️⃣ If Expression (Ternary Alternative)
    // ----------------------------------
    // Kotlin does not have a ternary operator (? :)
    // Instead, `if` can be used as an expression that returns a value
    println("Greater value is: ${if (a > b) a else b}")

    // ----------------------------------
    // 3️⃣ If-Else Ladder Example
    // ----------------------------------

    var marks = 35

    var grade = if (marks > 60) "First Division" else if(marks > 45) "Pass" else "Fail"

    println("Grade: $grade")

}