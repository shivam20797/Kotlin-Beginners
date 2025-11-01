/**
 * Topic: var, val, data types, and basic Kotlin syntax
 * Author: Aakash
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 * This file explains:
 * - Difference between `var` and `val`
 * - Type inference in Kotlin
 * - Basic data types (Int, Double, String)
 * - String interpolation (using $variable)
 * - Comparison with Java
 */


fun main(args : Array<String>) {

    // -------------------------------
    // 1️⃣ Variable Declaration
    // -------------------------------
    // `var` = mutable variable (value can be changed)
    var a = 14  // Kotlin automatically infers type as Int
    var b = 78.9 // Kotlin infers type as Double
    var name = "Dev"  // Type inferred as String

    println(a)  // Output: 14

    // -------------------------------
    // 2️⃣ Increment Operations
    // -------------------------------

    a++ // post-increment: increases after this line
    ++a // pre-increment: increases before usage
    println(a++)  // prints current a, then increases it by 1

    // -------------------------------
    // 3️⃣ Immutable Variable
    // -------------------------------

    // `val` = read-only variable (cannot be reassigned)

    val e : Int  = 10
    println("Value of a is $a")  // String interpolation
    println("Value of e is $e")
    println("Addition of $a and $b : ${a+b}")

}

/*
----------------------------------------------------------
🆚 Java Comparison

In Java:
--------------------
int a = 14;
double b = 78.9;
String name = "Dev";

System.out.println("Value of a is " + a);
System.out.println("Addition of " + a + " and " + b + " : " + (a + b));

Key Differences:
1. Kotlin uses `var` and `val` instead of Java's type-first syntax.
2. Kotlin has *type inference* — no need to specify the type unless you want to.
3. String interpolation is cleaner using `$variable` or `${expression}`.
4. `val` makes variables immutable (like `final` in Java).
----------------------------------------------------------
*/
