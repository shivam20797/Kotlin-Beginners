/**
 * Topic: when Expression in Kotlin
 * Author: Aakash
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 * This example demonstrates how `when` in Kotlin works as a more powerful
 * and flexible version of Java's `switch-case`.
 *
 * Concepts covered:
 *  - One-line `when` usage
 *  - Multi-line blocks inside `when`
 *  - Using `when` as an expression to return a value
 *  - Using `in`, `!in`, and ranges with `when`
 */

fun main(){

    val a = 50
    val b = 5

    val opr = "add"


    // ----------------------------------
    // 1️⃣ Simple One-Line Execution
    // ----------------------------------

    when(opr){
        "add" -> println("Addition is ${a+b}")
        "sub" -> println("Subtraction is ${a-b}")
        "mul" -> println("Multiplication is ${a*b}")
        "div" -> println("Division is ${a/b}")
        "mod" -> println("Remainder is ${a%b}")
        else -> println("Wrong  operator")
    }

    // ----------------------------------
    // 2️⃣ Multi-line Block Execution
    // ----------------------------------

    when(opr){
        "add" ->{
            val c = a+b
            println("Addition is $c")
        }
        "sub" -> println("Subtraction is ${a-b}")
        "mul" -> println("Multiplication is ${a*b}")
        "div" -> println("Division is ${a/b}")
        "mod" -> println("Remainder is ${a%b}")
        else -> println("Wrong  operator")
    }

    // ----------------------------------
    // 3️⃣ Using when as an Expression (returns value)
    // ----------------------------------

    val c =  when(opr){
        "add" -> a+b
        "sub" -> a-b
        "mul" -> a*b
        "div" -> a/b
        "mod" -> a%b
        else -> 0
    }

    println("c is $c")

    // ----------------------------------
    // 4️⃣ Using when with Ranges and Conditions
    // ----------------------------------

    val num = -1
    when(num){
        num%2 -> println("c is even")
        in 1..9 -> println("c is one digit number")
        !in 1..9 -> println("c is not in one digit number") // in
        in 1 until 10 -> println("c is one digit number")
    }


}

/*
----------------------------------------------------------
🆚 Java Comparison

In Java:
--------------------
switch(opr) {
    case "add": System.out.println("Addition: " + (a + b)); break;
    case "sub": System.out.println("Subtraction: " + (a - b)); break;
    default: System.out.println("Wrong operator");
}

Kotlin Simplifications:
1. `when` replaces `switch-case` (no `break` needed).
2. Can be used as an expression that returns a value.
3. Supports conditions, ranges, and types — more flexible than Java.
4. No need for `case` or `default`; use clean `when` branches.
----------------------------------------------------------
*/