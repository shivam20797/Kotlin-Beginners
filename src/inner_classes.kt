/**
 * Topic: Nested Class vs Inner Class in Kotlin
 * Author: Shivam
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 *
 * Kotlin supports two types of classes declared inside another class:
 *
 * 🔹 Nested Class
 * - Declared without the `inner` keyword.
 * - Does NOT hold a reference to the outer class.
 * - Cannot access members of the outer class.
 * - Works like a static nested class in Java.
 *
 * 🔹 Inner Class
 * - Declared using the `inner` keyword.
 * - Holds a reference to the outer class.
 * - Can access all members of the outer class (including `private`).
 *
 * This example demonstrates the difference between
 * a nested class and an inner class.
 */

class OuterClass{

    var className = "Outer"

    private var className1 = "Outer"

    /**
     * Nested class (static-like)
     */

    class InnerClass{
        fun innerFunction(){
            //  Cannot access outer class members
            //println("Print class name $className") give error
            println("Nested class: no access to outer class members")
        }
    }

    /**
     * Inner class (has reference to outer class)
     */
    inner class InnerClass1{
        fun innerFunction(){
            //  Can access both public and private members
            println("Print class name $className $className1 ")
        }
    }
}

fun main(){
    //var innerObject = InnerClass() error
    val innerObject = OuterClass.InnerClass()
    println(innerObject.innerFunction())

    val innerObject1 = OuterClass().InnerClass1()
    println(innerObject1.innerFunction())
}

/**
 * 🧠 Notes:
 *
 * ✅ Nested class:
 * - Does not need an instance of outer class.
 * - Cannot access outer class members.
 *
 * ✅ Inner class:
 * - Requires an instance of outer class.
 * - Can access all members of outer class.
 *
 * ❌ This will cause an error:
 * ```
 * class InnerClass {
 *     println(className) // not accessible
 * }
 * ```
 *
 * ✅ Key Difference:
 *
 * | Feature | Nested Class | Inner Class |
 * |--------|--------------|-------------|
 * | Keyword | none | `inner` |
 * | Outer class reference | ❌ No | ✅ Yes |
 * | Access outer members | ❌ No | ✅ Yes |
 * | Requires outer object | ❌ No | ✅ Yes |
 *
 * 🔑 Summary:
 * - Use **nested class** when outer class data is NOT needed.
 * - Use **inner class** when outer class data IS needed.
 */