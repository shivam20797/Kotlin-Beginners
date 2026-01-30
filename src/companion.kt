/**
 * Topic: Object Declarations & Companion Objects in Kotlin
 * Author: Shivam
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 *
 * Kotlin provides several ways to create singleton objects and factory methods:
 * 1. **Object declarations** – create a singleton instance with its own methods.
 * 2. **Companion objects** – single object associated with a class, can access private members and act like static methods.
 * 3. **Factory pattern** – companion object can provide custom creation logic.
 *
 * This example demonstrates:
 * - Singleton objects inside a class (`Student`, `Teacher`)
 * - Companion object (`Friend`)
 * - Private constructor + companion factory (`CollegeStudent.Factory`)
 */


fun main(){

    // Accessing object functions
    NewPerson.Student.name()
    NewPerson.Teacher.name()
    NewPerson.name()  // prints "Friend" (companion object)

    // Using companion object as factory
    val cName = CollegeStudent.Factory.create("B.tech")
    println(cName.stream)

    // Using companion object factory directly (shortcut)
    val cName1 = CollegeStudent.create("B.tech")
    println(cName1.stream)

}

/**
 * Class demonstrating object declarations and companion object
 */

class NewPerson{
    object  Student{
        fun name(){
            println("Student")
        }
    }
    object  Teacher{
        fun name(){
            println("Teacher")
        }
    }
    companion object Friend{
        fun name(){
            println("Friend")
        }
    }
    // only one companion object
}

/**
 * Class demonstrating private constructor with companion factory
 */
class CollegeStudent private  constructor(val stream:String){
    companion object Factory{
        fun create(stream:String):CollegeStudent{
            return  when(stream){
                "B.tech" -> CollegeStudent("B.tech")
                else -> CollegeStudent("clgStudent")
            }
        }
    }
}

/**
 * 🧠 Notes:
 *
 * ✅ Object declarations:
 * - Declared with `object` keyword inside or outside a class
 * - Singleton by default
 * - Can contain functions and properties
 *
 * ✅ Companion objects:
 * - Only **one per class**
 * - Acts like **static members** in Java
 * - Can be named or unnamed
 * - Can implement interfaces
 *
 * ✅ Factory method with companion object:
 * - Provides controlled creation of objects
 * - Useful for private constructors
 * - Simplifies object creation logic
 *
 * ✅ Key Takeaways:
 * - Use **object** for singleton instances.
 * - Use **companion object** for static-like methods.
 * - Use **companion factory** for controlled creation of objects with private constructors.
 *
 * 🔧 Usage patterns:
 * ```
 * val obj = ClassName.CompanionObject.method()
 * val obj2 = ClassName.method() // shortcut if companion object exists
 * ```
 */
