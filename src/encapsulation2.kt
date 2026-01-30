/**
 * Topic: Private Members Are Not Accessible Outside Their Scope
 * Author: Shivam
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 *
 * In Kotlin, members marked with the **`private`** access modifier
 * are **strictly limited to their declared scope**.
 *
 * This means:
 * - A `private` function at the file level is accessible **only within that file**.
 * - A `private` member inside a class is accessible **only inside that class**.
 * - `private` members are **NOT inherited** by child classes.
 *
 * This example demonstrates:
 * - Why a private function cannot be called from another class.
 * - Why a child class cannot access private members of its parent.
 */

fun main(){

    // Not accessible: abc() is private to this file
    //abc()
}

/**
 * Private function (file-level)
 * Accessible only within this file
 */


class D:B(){

}
