/**
 * Topic: Classes and Objects in Kotlin
 * Author: Shivam
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 * This file explains how Classes, Objects, and Constructors work
 * in Kotlin with simple and real-life examples.
 *
 * Key Concepts Covered:
 *  - Class: A blueprint that defines properties and functions.
 *  - Object: An instance of a class (real entity created from the class).
 *  - Primary Constructor: Declared in the class header to initialize properties.
 *  - Secondary Constructor: Provides an alternative way to create objects.
 *  - Init Block: Executes automatically when an object is created.
 *
 * Additional Notes:
 *  - If 'var' or 'val' is not used in the constructor, parameters are not stored as class properties.
 *  - You can define multiple 'init' blocks; they execute in order of appearance.
 *
 * Example Includes:
 *  - Person class with properties (name, age, gender, occupation) and methods.
 *  - Animal class demonstrating both primary and secondary constructors.
 *  - Usage of init blocks and method calls from main().
 */

fun main() {

    // Creating objects of Person class using Primary Constructor
    val person1 = Person(age = 23, name = "Peter", gender = "Male", occupation = "KDev")
    val person2 = Person(name = "Meera", age = 20, gender = "Female", occupation = "KYoutuber")

    // Accessing properties
    println("name of person is ${person1.name}")
    println("name of person is ${person2.name}")

    // Calling class methods
    person1.getAge()
    person2.getAge()
    person1.getGender()
    person2.getGender()


    // ---------------------------------------------------------
    // Animal class examples
    // ---------------------------------------------------------


    // Creating object using Primary Constructor
    //val animal = Animal() // Default Constructor
    val animal = Animal("cow", 5, "Jersey", "Black")
    println("animal is color ${animal.color}")

    // Creating object using Secondary Constructor
    val animal2 = Animal(animalName = "cow", animalColor = "Red")
    println("animal color is ${animal2.color}")
}