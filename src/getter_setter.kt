/**
 * Topic: Getter and Setter in Kotlin
 * Author: Shivam
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 * This program explains how custom getters and setters work
 * in Kotlin and how validation can be added using setters.
 *
 * Concepts Covered:
 * 1. Default Getter and Setter
 * 2. Custom Getter
 * 3. Custom Setter with validation
 * 4. Backing field (`field`)
 *
 * Notes:
 *  - 'lateinit' cannot be used with primitive types like Int, Double, Boolean.
 *  - Custom getters and setters allow data validation and transformation.
 *  - Kotlin automatically creates default getters and setters for 'var' properties.
 *
 * Example Includes:
 *
 *  - Voter class with:
 *      - Validation in setter (age cannot be less than 18)
 *      - Custom getter that adds message for name
 *  - Object creation and property access in main().
 */

fun main() {

    // Creating object of Voter class
    val voter = Voter(18)

    // Trying to set age
    voter.ageToVote = 12
    println(voter.ageToVote)

    // Calling custom getter
    println(voter.nameOfVoter)

    // Default getter (val property)
    println(voter.nameOfVoter1)
}


class Voter(age: Int) {
    /**
     * Voter class demonstrates custom getter and setter
     */

    // lateinit cannot be used with primitive types like Int
    // lateinit var ageToVote: Int ❌

    /**
     * var property → has both getter and setter
     */

    var ageToVote: Int  = age
//        get() = field
//        set(value) {
//            field = value
//        }

        // Custom Setter with validation
        set(value) {
            if(value < 18) {
                println("Age to vote can't be less than 18")
            }
            else{
                field = value
            }
        }

    /**
     * Custom Getter Example
     * Modifies the returned value
     */

    var nameOfVoter: String = "Shivam"
        get(){
            return "$field is eligible to vote"
        }

    /**
     * val property → only getter (read-only)
     */
    val nameOfVoter1: String = "Shivam" // only getter


}