/**
 * Topic: Getter and Setter in Kotlin
 * Author: Aakash
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 * This example demonstrates how to use custom getters and setters in Kotlin.
 *
 * Key Concepts Covered:
 *  - Getter: Used to retrieve a property’s value (you can customize how it returns data).
 *  - Setter: Used to set or modify a property’s value (you can add validation logic here).
 *  - The 'field' keyword: Refers to the backing field that stores the property’s actual data.
 *
 * Notes:
 *  - 'lateinit' cannot be used with primitive types like Int, Double, Boolean.
 *  - Custom getters and setters allow data validation and transformation.
 *  - Kotlin automatically creates default getters and setters for 'var' properties.
 *
 * Example Includes:
 *  - Voter class with:
 *      - Validation in setter (age cannot be less than 18)
 *      - Custom getter that adds message for name
 *  - Object creation and property access in main().
 */

fun main() {
    val voter = Voter(18)
    voter.ageToVote = 12 // trying to set invalid age
    println(voter.ageToVote)
    println(voter.nameOfVoter) // calls custom getter
    println(voter.nameOfVoter1)
}


class Voter(age: Int) {
    var ageToVote: Int = age
//        get() = field
//        set(value) {
//            field = value
//        }

    // default
    // Custom Setter Example
        set(value) {
           if(value < 18) {
               println("Age to vote can't be less than 18")
           }
            else{
                field = value
            }
        }
    // Custom Getter Example
    var nameOfVoter: String = "Aakash"  // both getter + setter
        get(){
            return "$field is eligible to vote"
        }

    val nameOfVoter1: String = "Aakash" // only getter


}