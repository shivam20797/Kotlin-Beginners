
/**
 * Topic: Operators in Kotlin
 * Author: Shivam
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 * This example explains all types of operators in Kotlin:
 *  - Arithmetic operators (+, -, *, /, %)
 *  - Assignment operators (+=, -=, *=, /=, %=)
 *  - Relational operators (<, >, <=, >=, ==, !=)
 *  - Logical operators (&&, ||, !)
 *  - Increment / Decrement operators (++, --)
 *
 * Each example includes print output and short explanations.
 */

fun main(){

    // ----------------------------------
    // 1️⃣ Arithmetic Operators
    // ----------------------------------


    val a = 20
    val b = 16
    println("Addition (a + b) = ${a + b}")
    println("Subtraction (a - b) = ${a - b}")
    println("Multiplication (a * b) = ${a * b}")
    println("Division (a / b) = ${a / b}") // integer division
    println("Division (a / b) = ${a.toFloat() / b}") // converted to Float for decimal output
    println("Modulus (a % b) = ${a % b}")  // remainder

    // ----------------------------------
    // 2️⃣ Assignment Operators
    // ----------------------------------

    var x = 5
    x +=10
    /*
       ⚠️ Note:
       x += 10   ✅ adds 10 to x
       x = +10   ❌ just assigns +10 (positive 10) to x
     */

    println("x+=10 = $x")

    x -=10
    println("x-=10 = $x")

    x *=10
    println("x*=10 = $x")

    x %= 20
    println("x%=20 = $x")

    x /=10
    println("x/=10 = $x")

    // ----------------------------------
    // 3️⃣ Relational Operators
    // ----------------------------------

    println("a is $a x is $x")
    println("a<x = ${a<x}")
    println("a>x = ${a>x}")
    println("a>=x = ${a>=x}")
    println("a<=x = ${a<=x}")
    println("a==x = ${a==x}")
    println("a!=x = ${a!=x}")


    // ----------------------------------
    // 4️⃣ Logical Operators
    // ----------------------------------

    var i = 10
    val j = 20
    val k = 30

    println("i>j && k>j : ${i>j && k>j}") // AND
    println("i>j || k>j : ${i>j || k>j}") // OR
    println("!(i>j) : ${!(i>j)}") // NOT

    // ----------------------------------
    // 5️⃣ Increment and Decrement Operators
    // ----------------------------------

    println("Pre-increment ++i → ${++i}")      // increment first, then print
    println("Post-increment i++ → ${i++}")     // print value, then increment
    println("After post-increment i = $i")
    println("Post-decrement --i → ${--i}")     // decrement first, then print
    println("Pre-decrement i-- → ${i--}")      // print value, then decrement
    println("After post-decrement i = $i")
}

/*
----------------------------------------------------------
🆚 Java Comparison

In Java:
--------------------
int a = 5, b = 10;
System.out.println("Addition: " + (a + b));

Kotlin Advantages:
1. Cleaner string templates → "Result is ${a+b}"
2. Type inference → no need to declare `int`
3. Division auto-handles types via `toFloat()`
4. No semicolons required
----------------------------------------------------------
*/