/**
 * Topic: Access Modifiers in Kotlin
 * Author: Shivam
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 *
 * Access modifiers in Kotlin define the **visibility and accessibility**
 * of classes, functions, variables, and properties.
 * They help in achieving **encapsulation**, one of the core principles of OOP.
 *
 * Kotlin provides four main access modifiers:
 *
 * 🔹 `public`    → Accessible from anywhere (default).
 * 🔹 `private`   → Accessible only within the same file or class.
 * 🔹 `protected` → Accessible within the class and its subclasses.
 * 🔹 `internal`  → Accessible within the same module.
 *
 * This example demonstrates:
 * - File-level access control
 * - Class-level access control
 * - Usage of `private` and `protected`
 * - How access modifiers behave with inheritance
 */

fun main(){
    abc()
    val instanceA = A()
    instanceA.a = 20

    // ❌ Not accessible (private)
    // instanceA.b = 20

    // ❌ Not accessible (protected)
    // instanceA.xyz()
}

/**
 * File-level variable (public by default)
 */

var a = 0;

/**
 * Private function – accessible only within this file
 */
private  fun abc(){

}
/**
 * Open class A
 */
open class A{
    // Public property (default)
    var a = 0

    // Private property – accessible only inside class A
    private var b = 11

    // Protected function – accessible in subclasses
    protected  fun xyz(){
        println("b is $b")
    }
}


/**
 * Class B inherits from A
 * Demonstrates access to protected members
 */

open class B:A(){
    fun abc(){
        super.a = 20       //  public member
        super.xyz()        //  protected member (accessible in subclass)
    }

}

// protected not used in class