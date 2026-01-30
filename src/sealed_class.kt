/**
 * Topic: Sealed Classes in Kotlin
 * Author: Shivam
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 *
 * Sealed classes are a special kind of class in Kotlin that allow you
 * to **restrict the types** that can inherit from them.
 * They are often used to represent **finite states** or **result types**.
 *
 * Key Points:
 * - Sealed classes are **abstract by default**.
 * - All subclasses must be declared in the same file.
 * - They provide **exhaustive `when` expressions** without `else`.
 * - Useful for modeling states like Loading, Success, and Failure.
 *
 * Example below demonstrates:
 * - `Result` sealed class
 * - `Loading`, `Success`, `Failure` states
 * - `when` expression with type checks
 */

fun main(){
    //var result = Result()
    var loading = Result.Loading()
    var success = Success()
    var failure = Failure()
    stateCheck(loading)
    stateCheck(success)
    stateCheck(failure)
}

/**
 * Function to check the type of Result and print state
 */
fun stateCheck(state:Result){
    when(state) {
        is Failure -> println("State is failed")
        is Result.Loading -> println("State is loading")
        is Success -> println("State is success")
    }
}

/**
 * Sealed class representing different result states
 */
sealed class Result{
    class Loading:Result()
}

/**
 * Subclass representing a successful result
 */
class Success:Result()


/**
 * Subclass representing a failed result
 */
class Failure:Result()

/**
 * 🧠 Notes:
 *
 * ✅ Sealed classes vs regular classes:
 * - Regular class: Open to any subclass anywhere
 * - Sealed class: Subclasses must be in the same file
 *
 * ✅ Advantages of sealed classes:
 * - Enforces limited hierarchy
 * - Makes `when` expressions exhaustive (compiler checks)
 * - Improves readability and maintainability
 *
 * ✅ Typical Use Cases:
 * - Representing UI states: Loading / Success / Error
 * - Representing Result types: Success / Failure
 * - Modeling state machines
 *
 * 🔑 Key Takeaway:
 * Sealed classes provide **type-safe modeling of restricted hierarchies**,
 * making your code more robust and readable.
 */