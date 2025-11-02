import java.time.Year

/**
 * Topic: Inheritance in Kotlin
 * Author: Aakash
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 *
 * Inheritance in Kotlin is an object-oriented programming (OOP) feature that allows one class (called the child or subclass)
 * to acquire the properties and behaviors (methods and variables) of another class
 * (called the parent or superclass).
 * It helps in reusing existing code, avoiding duplication, and creating hierarchical
 * relationships between classes.
 *
 * This example demonstrates different types of inheritance in Kotlin:
 *
 * 🔹 **Single Inheritance** – A subclass inherits from one superclass.
 * 🔹 **Multilevel Inheritance** – A class inherits from another derived class.
 * 🔹 **Hierarchical Inheritance** – Multiple classes inherit from a single parent.
 *
 * Key Notes:
 * - Kotlin classes are **final by default**, so to allow inheritance,
 *   you must mark a class as **open**.
 * - `open` keyword → allows a class or member to be inherited or overridden.
 * - `:` symbol → is used to inherit from a superclass.
 */

fun main(){
    var derived = Derived()
    derived.name = "Peter"
    derived.name2 = "Meera"
    println(derived.name)
    println(derived.name2)
    derived.method()
    derived.method2()

    val car = SimpleCar("Red")
    car.drive()
}

// ------------------------
// Single Inheritance Example
// ------------------------

open class Base{
    var name = "Base"
    fun method(){
        println("I am $name class")
    }
}

open class Dummy{
    var name = "Base"
    fun method(){
        println("I am $name class")
    }
}

class Derived: Base(){
    var name2 = "Derived"
    fun method2(){
        println("I am $name2 class")
    }
}

// ------------------------
// Multilevel + Hierarchical Example
// ------------------------

// multiple inheriatnce not supported

//class Derived: Base(),Dummy{
//    var name2 = "Derived"
//    fun method2(){
//        println("I am $name2 class")
//    }
//}

open class Vehicle(color: String){
    init {
        println("vehicle class created")
    }
    // Secondary constructor
    constructor(color1: String,year: String): this(color1) {
        println("Secondary constructor called (default color set)")
    }

    open var name = "Vehicle"
    open fun drive(){
        println("$name is driving")
    }
}

open  class Car(color: String) : Vehicle(color){
    init {
        println("car class created")
    }
    override var name = "Car"
    override fun drive() {
        super.drive() // if we called parent class function
        println("$name is driving")

    }
}

// note - always create parent object after that create child object

class SimpleCar(color: String) : Car(color){
    init {
        println("simple car class created")
    }
    override var name = "Simple Car"
    override fun drive() {
        super.drive() // if we called parent class function
        println("$name is driving")

    }
}


/**
 * 🧠 Concept Recap:
 *
 * ✅ Inheritance allows reusability of code and logical grouping of classes.
 * ✅ Use `open` keyword for base classes and members.
 * ✅ Use `override` to redefine parent properties or methods.
 * ✅ Parent class constructors are always called first when creating objects.
 *
 * 🌟 Advantages:
 *  - Code reusability
 *  - Less duplication
 *  - Easier maintenance
 *  - Logical class hierarchy
 *
 * ⚠️ Disadvantages:
 *  - Tight coupling between classes
 *  - Inflexible if overused
 *  - Changes in parent can affect all children
 *
 * 💡 Real-world Example:
 *  - `Vehicle` → `Car` → `SportsCar`
 *  - `Employee` → `Manager` → `Director`
 */
