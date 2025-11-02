
/**
 * Topic: Function Overriding in Kotlin
 * Author: Aakash
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 *
 * Function overriding is an important concept in Object-Oriented Programming (OOP).
 * It allows a subclass (child class) to provide its own implementation
 * of a function that is already defined in its superclass (parent class).
 *
 * When a function in the parent class is marked with the **`open`** keyword,
 * it can be **overridden** in the child class using the **`override`** keyword.
 *
 * 👉 Key Points:
 * - Kotlin classes and functions are `final` by default — they cannot be inherited or overridden.
 * - To allow overriding:
 *      → mark parent class and method as **open**.
 * - To provide a new implementation:
 *      → use the **override** keyword in the child class.
 * - During runtime, the **actual object type** determines which method is called (not the reference type).
 *
 * Example Below:
 * - The `Shape` class is a parent class.
 * - Classes `Rectangle`, `Circle`, `Triangle`, and `Square` override the `draw()` function.
 * - Demonstrates **runtime polymorphism** (dynamic method dispatch).
 */

fun main(){
    // Reference of type Shape pointing to object of Rectangle
    val rect:Shape = Rectangle()
    rect.draw()

    println("\n--- Drawing multiple shapes using overriding ---")

    // Array of different shapes (Polymorphism in action)
    val array = arrayOf(Rectangle(), Circle(), Triangle(),Square())
    for(shape in array){
        shape.draw()
    }
}


/**
 * Base class
 */

open class Shape{
    open fun draw(){
        println("Shape drawn")
    }
}

class Rectangle:Shape(){
    override fun draw(){
        println("Rectangle drawn")
    }
}

class Circle:Shape(){
    override fun draw(){
        println("Circle drawn")
    }
}

class Triangle:Shape(){
    override fun draw(){
        println("Triangle drawn")
    }
}

class Square:Shape(){
    override fun draw(){
        println("Square drawn")
    }
}

/**
 * 🧠 Notes:
 *
 * ✅ **What is Overriding?**
 * Overriding means redefining a function of a parent class in its child class.
 * The child class provides its own behavior for that function.
 *
 * ✅ **Why use Overriding?**
 * - To customize or extend parent class behavior.
 * - Enables **runtime polymorphism**.
 * - Helps in designing flexible, reusable, and maintainable code.
 *
 * ✅ **Example in real life:**
 * - `Shape` → `draw()` is generic.
 * - Each specific shape (`Circle`, `Rectangle`, `Square`) draws differently.
 *
 * ⚙️ **Rules for Overriding in Kotlin**
 * 1. Parent class must be marked as `open` or `abstract`.
 * 2. The parent function must be marked as `open` or `abstract`.
 * 3. Child class uses the `override` keyword to redefine the function.
 * 4. You can call the parent class version using `super.draw()`.
 *
 * ✅ **Example of super usage:**
 * ```
 * class Rectangle : Shape() {
 *     override fun draw() {
 *         super.draw() // calls parent function
 *         println("Rectangle drawn")
 *     }
 * }
 * ```
 */