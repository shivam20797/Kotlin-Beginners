/**
 * Topic: Abstraction in Kotlin (Abstract Class & Methods)
 * Author: Aakash
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 * Abstraction is one of the core concepts of Object-Oriented Programming (OOP).
 * It is the process of hiding implementation details from the user
 * and showing only the essential features of an object.
 *
 * In Kotlin, **abstraction** can be achieved using:
 *  - **Abstract classes**
 *  - **Interfaces**
 *
 * 🧩 Abstract Class:
 * - Declared using the `abstract` keyword.
 * - Can contain both abstract (unimplemented) and non-abstract (implemented) members.
 * - You cannot create an instance (object) of an abstract class.
 * - Child classes must implement all abstract properties and functions.
 *
 * 🧩 Interface:
 * - Defines a *contract* or *behavior* that classes can implement.
 * - Can contain abstract functions (no body) and also default method implementations.
 * - A class can **implement multiple interfaces**, achieving multiple inheritance of type.
 *
 * Example:
 * Below, we define an abstract class `Shapes` that implements two interfaces `Name` and `Color`.
 * Each concrete class provides its own implementation of the abstract members.
 */

fun main(){

    // Abstract class reference to subclass object
    val rect:Shapes = RectangleA()
    rect.draw()

    println("\n--- Drawing All Shapes ---")

    // Array of different shapes
    val array = arrayOf(RectangleA(), CircleA(), TriangleA(),SquareA())
    for(shape in array){
        shape.draw()
        shape.name()
    }

    println("\n--- Interface Example ---")
    val array1 = arrayOf(RectangleA(), CircleA(), TriangleA(),SquareA(),Picture())
    for(shape in array1){

        shape.name()
    }
}


/**
 * Interfaces - defines common behaviors
 */
interface Name{
    fun name()
}

interface Color{
    fun color()
}

/**
 * Abstract class implementing multiple interfaces
 */

abstract class Shapes:Name,Color{
    // Abstract property (must be implemented in subclass)
    abstract var i : Int
    // Abstract functions (no body, must be overridden)
    abstract fun draw()
}

/**
 * Derived classes implement all abstract members
 */



class RectangleA:Shapes(){
    override var i:Int = 10
    override fun draw(){
        println("Rectangle drawn")
    }
    override fun name() {
        println("Name is Rectangle")
    }

    override fun color() {
        println("Color")
    }
}

class CircleA:Shapes(){
    override var i:Int = 10
    override fun draw(){
        println("Circle drawn")
    }
    override fun name() {
        println("Name is Circle")
    }
    override fun color() {
        println("Color")
    }
}

class TriangleA:Shapes(){
    override var i:Int = 10
    override fun draw(){
        println("Triangle drawn")
    }
    override fun name() {
        println("Name is Triangle")
    }
    override fun color() {
        println("Color")
    }
}

class SquareA:Shapes(){
    override var i:Int = 10
    override fun draw(){
        println("Square drawn")
    }
    override fun name() {
        println("Name is Square")
    }
    override fun color() {
        println("Color")
    }
}
/**
 * Class implementing only interface (no abstract class)
 */
class Picture:Name{
    override fun name() {
        println("Name is picture")
    }
}

/**
 * 🧠 Notes:
 *
 * ✅ What is Abstraction?
 * Abstraction hides complex logic and exposes only what’s necessary to the user.
 * For example, when you drive a car, you use the steering wheel —
 * but you don’t see how the steering mechanism works internally.
 *
 * ✅ Why Use Abstraction & Interfaces?
 * - Improves modularity and reusability.
 * - Simplifies large systems.
 * - Defines *what to do* rather than *how to do it*.
 * - Allows multiple inheritance of behavior through interfaces.
 * ✅ Difference Between Abstract Class & Interface in Kotlin:
 *
 * | Feature | Abstract Class | Interface |
 * |----------|----------------|------------|
 * | Keyword | `abstract class` | `interface` |
 * | Inheritance | Single | Multiple |
 * | Members | Can have both abstract and concrete members | Abstract by default, but can have default implementations |
 * | Constructor | Yes | No |
 * | Variables | Can have state (fields) | Cannot hold state directly |
 * | Purpose | Common base class with shared logic | Defines contract/behavior |
 *
 * ✅ Kotlin vs Java Syntax Difference:
 *
 * | Concept | Java Keyword | Kotlin Equivalent |
 * |----------|---------------|------------------|
 * | Extend class | `extends` | `:` |
 * | Implement interface | `implements` | `:` |
 *
 * ✅ Rules:
 * 1. You cannot create an object of an abstract class.
 * 2. Abstract methods and properties must be overridden in child classes.
 * 3. Abstract classes can also have normal (non-abstract) methods and properties.
 * 4. Abstract members cannot have a body.
 *
 * 🔹 Example in Java:
 * ```java
 * class Circle extends Shape implements Color, Name {}
 * ```
 * 🔹 Equivalent in Kotlin:
 * ```kotlin
 * class Circle : Shape(), Color, Name
 * ```
 *
 * ✅ Summary:
 * - `abstract` classes define common structure + optional logic.
 * - `interface` defines behavior contracts.
 * - In Kotlin, both are connected using the **`:`** symbol instead of `extends`/`implements`.
 */
