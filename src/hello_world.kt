/**
 * Topic: print(), println(), and main() function in Kotlin
 * Author: Aakash
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 * - Difference between print() and println()
 * - Simplified Kotlin main function (no need for 'public static void')
 * - Comparison with Java syntax
 */


fun main(args: Array<String>){

    // print() → prints text on the same line

    print("Welcome to Kotlin")

    // println() → prints text and moves the cursor to the next line
    println("Learning Kotlin Series")// after this line, next output appears on a new line

    // Example: multiple print statements
    print("Check Print")  // stays on the same line
    print(1+9)  // can print expressions too
    print(false)  // can print boolean values as well
}

/*
----------------------------------------------------------
🆚 Java Comparison

In Java:
--------------------
public class Main {
    public static void main(String[] args) {
        System.out.print("Welcome to Kotlin");
        System.out.println("Learning Kotlin Series");
        System.out.print("Check Print");
        System.out.print(1 + 9);
        System.out.print(false);
    }
}

Kotlin Simplifications:
1. No need for 'public static void' — `fun main()` is enough.
2. No class wrapper required — you can run directly from a file.
3. `print()` and `println()` work like Java's, but cleaner syntax.
4. Supports string interpolation, expressions, and booleans directly.
----------------------------------------------------------
*/