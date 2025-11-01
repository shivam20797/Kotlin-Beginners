/**
 * Topic: String Concatenation in Kotlin
 * Author: Aakash
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 * This example shows how to join (concatenate) strings using the `+` operator in Kotlin.
 * Kotlin also supports string templates (e.g., "Hello, $name"), which are usually preferred.
 */


fun main() {
    // String concatenation using +
    println("Hello, "  + "!") // Output: Hello, !
}

/*
----------------------------------------------------------
🆚 Java Comparison

In Java:
--------------------
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, " + "!");
    }
}

Kotlin Simplifications:
1. No need for 'public static void main' or class.
2. Same `+` operator works for string concatenation.
3. You can also use string templates in Kotlin:
   val name = "Dev"
   println("Hello, $name!")
----------------------------------------------------------
*/