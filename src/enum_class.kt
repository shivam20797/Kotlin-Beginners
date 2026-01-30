/**
 * Topic: Enum Classes in Kotlin
 * Author: Shivam
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 *
 * Enums in Kotlin are a way to define a **fixed set of constants**.
 * Each enum constant is an object.
 *
 * Features of Kotlin enums:
 * - Enum constants are instances of the enum class.
 * - Can have **properties** and **functions**.
 * - `ordinal` → gives the position of the enum constant (0-based index).
 * - `name` → gives the string name of the enum constant.
 * - `entries` → returns all enum constants as an array.
 *
 * This example demonstrates:
 * 1. A simple enum `Direction`
 * 2. Enum with properties and functions `WeekName`
 * 3. Iterating over all enum entries
 */

fun main(){

    // Simple enum usage
    val direction = Direction.East
    println(direction)

    // Enum with property
    val weekName = WeekName.Sun
    println(weekName)
    println(weekName.num)
    println(weekName.ordinal)


    // Iterating over all enum constants
    println("\nAll week names:")
    for (i in WeekName.entries){
        println(i.name)
    }

    // Calling enum function

    weekName.printWeekName()
}

/**
 * Simple enum representing directions
 */

enum class Direction{
    East,
    West,
    North,
    South
}

/**
 * Enum with property and function
 */

enum class WeekName(val num:Int){
    Sun(0),
    Mon(1),
    Tue(2),
    Wed(3);

    fun printWeekName(){
        println("Name of week is : $this")
    }
}

/**
 * 🧠 Notes:
 *
 * ✅ Enums vs constants:
 * - Enum provides **type safety** and extra features.
 * - Enum constants are objects and can have properties/methods.
 *
 * ✅ Key features of enums in Kotlin:
 * - `ordinal` → position of the constant
 * - `name` → name of the constant
 * - `entries` → array of all constants
 * - Can define properties and functions
 *
 * ✅ Use Cases:
 * - Directions: North, South, East, West
 * - Days of the week
 * - Status codes: SUCCESS, FAILURE, LOADING
 *
 * 🔑 Key Takeaway:
 * Kotlin enums are **powerful and type-safe** alternatives to constants.
 */