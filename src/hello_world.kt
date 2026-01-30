/**
 * Topic: print(), println(), and main() function in Kotlin
 * Author: Shivam
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 * - print() outputs text on the same line
 * - println() outputs text and moves to the next line
 * - Kotlin main() is simpler than Java's main()
 */


fun main(){

    // print() → prints text on the same line
    print("Welcome to Kotlin")

    // println() → prints text and moves the cursor to the next line
    println("Learning Kotlin Series")

    // Example: multiple print statements
    print("Check Print")
    print(12+29)
    print(false)
}

/*
----------------------------------------------------------
🆚 Java Comparison

// Java needs: public static void main()
// Kotlin needs: fun main()

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