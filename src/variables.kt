/**
 * Topic: var, val, data types, and basic Kotlin syntax
 * Author: Shivam
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 * This file explains:
 * - Difference between `var` and `val`
 * - Type inference in Kotlin
 * - Basic data types (Int, Double, String)
 * - String interpolation
 * - Comparison with Java
 */


fun main() {

    // -------------------------------
    // 1️⃣ Variable Declaration
    // -------------------------------

    // `var` → mutable variable (value CAN be changed)
    var a = 20  //  Type inferred as Int
    var b = 16.2 // Type inferred as Double

    // `val` → immutable variable (value CANNOT be changed)
    val name = "Dev"  // Type inferred as String

    println(a)
    println(b)
    println(name)

    // a = "Dev" Error: Type mismatch (Int cannot hold String)

    a = 80
    println(a)

    // name = "Ravi"  Error: val cannot be reassigned

    // -------------------------------
    // 2️⃣ Explicit Type Declaration
    // -------------------------------

    val e: Int = 10

    // -------------------------------
    // 3️⃣ String Interpolation
    // -------------------------------


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
