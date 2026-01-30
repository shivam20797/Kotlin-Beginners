
/**
 * Topic: Data Classes in Kotlin
 * Author: Shivam
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 *
 * Kotlin provides a special class type called **data class** to hold data.
 * Data classes automatically provide several useful functions:
 * - `toString()` → returns a readable string of properties
 * - `hashCode()` → generates hash based on properties
 * - `equals()` → compares objects by value
 * - `copy()` → creates a copy of the object with optional changes
 * - Component functions (`component1()`, `component2()`, etc.) for destructuring
 *
 * Regular classes do not provide these features automatically.
 *
 * This example demonstrates:
 * 1. A normal class (`Student`)
 * 2. A data class (`Student1`)
 * 3. Equality, copying, destructuring, and component functions
 */

fun main(){

    // Using normal class
    var std1 = Student(name = "Aaaki",grade = 10,age = 10)
    var std2 = Student(name = "Aaaki",grade = 10,age = 10)
    println(std1.toString())     // Class name + hashcode
    println(std1.hashCode())    // Unique hashcode
    println(std1.equals(std2)) // false → compares references
    println(std1 == std2)     // false → same as equals()

    // Using data class
    var std3 = Student1(name = "Aaaki",grade = 10,age = 10)
    var std4 = Student1(name = "Aaaki",grade = 10,age = 10)
    var std5 = std4.copy()                 // Copy exact
    var std6 = std4.copy(name =  "Raj")   // Copy with modification


    println("\nData class examples:")
    println(std3.toString())           // readable output
    println(std3.hashCode())          // hash based on properties
    println(std4.hashCode())         // hash based on properties
    println(std3.equals(std4))      // true → compares values
    println(std3 == std4)          // true → same as equals()
    println(std5)                 // copied object
    println(std6)                // copied object with changed property
    println(std6.component1())  // destructuring component1() → name


    // Destructuring declaration
    val(studName) = std6
    print(studName)
}

/**
 * Normal class – does NOT provide useful functions automatically
 */
class Student(val name:String,val grade:Int,val age:Int)

/**
 * Data class – automatically provides:
 * - equals()
 * - hashCode()
 * - toString()
 * - copy()
 * - componentN() functions
 */
data class Student1(val name:String,val grade:Int,val age:Int)

/**
 * 🧠 Notes:
 *
 * ✅ Use `data class` when the primary purpose of the class is to hold data.
 * ✅ Key differences between normal class and data class:
 *
 * | Feature        | Normal Class | Data Class |
 * |----------------|-------------|-----------|
 * | equals()       | Reference comparison | Property-wise comparison |
 * | hashCode()     | Default Object hash | Generated from properties |
 * | toString()     | ClassName@hash   | Readable property string |
 * | copy()         | ❌ Not available | ✅ Available |
 * | componentN()   | ❌ Not available | ✅ Available for destructuring |
 *
 * ✅ Destructuring example:
 * ```
 * val (name, grade, age) = Student1("Amit", 10, 15)
 * println(name)   // Amit
 * ```
 *
 * 🔑 Key takeaway:
 * - Always use **data classes** for immutable data objects.
 * - Regular classes are better for behavior-heavy objects.
 */