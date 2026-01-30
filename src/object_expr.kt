/**
 * Topic: Object Keyword & Anonymous Objects in Kotlin
 * Author: Shivam
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 *
 * Kotlin provides the `object` keyword to create:
 * 1. **Singleton objects** – only one instance exists.
 * 2. **Anonymous objects** – objects without a class name.
 *
 * Features demonstrated:
 * - `object` declaration → creates a singleton instance
 * - Anonymous object → implements an interface or extends a class on the fly
 * - Can contain properties and functions
 * - Can inherit from classes and implement interfaces
 *
 * This example demonstrates:
 * 1. Singleton object `NewCar`
 * 2. Anonymous object implementing interface `Type`
 */

fun main(){

    // Accessing singleton object
    println(NewCar.name) // Access property
    NewCar.getName()    // Call function

    // Creating an anonymous object implementing Type interface
    val obj1 = object:Type{
        val name = "Nisan"
        fun getName(){
            println("Name is $name")
        }

        override fun type() {
            println("Interface method implemented in anonymous object")
        }
    }
    // Call interface function
    obj1.type()
    // Call its own method (works only inside scope of anonymous object)
    // obj1.getName() // Accessible because inside the same scope
}

/**
 * Singleton object: only one instance exists
 */

object NewCar:NewVehicle(){
    val name = "Nisan"
    fun getName(){
        println("Name is $name")
    }
}

/**
 * Base class (can be inherited by object)
 */

open class NewVehicle

/**
 * Interface defining a contract
 */

interface  Type{
    fun  type()
}

/**
 * 🧠 Notes:
 *
 * ✅ `object` keyword in Kotlin:
 * - Declares a singleton instance.
 * - No constructor needed.
 * - Initialized when first accessed.
 *
 * ✅ Anonymous objects:
 * - Created on the fly without a class name.
 * - Can implement interfaces or extend classes.
 * - Useful for callbacks or temporary objects.
 *
 * ✅ Key Differences:
 * | Feature           | Object         | Anonymous Object |
 * |------------------|----------------|----------------|
 * | Named            | Yes            | No             |
 * | Singleton        | Yes            | Usually local  |
 * | Inheritance      | Can extend class / implement interfaces | Can extend / implement interfaces |
 * | Access properties| Directly via name | Only inside scope |
 *
 * ✅ Use Cases:
 * - Singleton pattern (like `NewCar`)
 * - Temporary objects for callbacks or listeners
 * - Implementing interfaces on the fly
 *
 * 🔑 Key Takeaway:
 * - `object` = singleton / global instance
 * - `anonymous object` = inline, temporary implementation
 */