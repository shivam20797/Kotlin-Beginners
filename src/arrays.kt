/**
 * Topic: Arrays in Kotlin
 * Author: Shivam
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 * Arrays in Kotlin are used to store multiple values of the same type.
 * Kotlin arrays are actually represented as classes with many helpful functions.
 *
 * Syntax:
 * val arrayName: Array<Type> = arrayOf(value1, value2, ...)
 */

fun main(){

    // --------------------------------------------------
    // 1️⃣ Creating Arrays
    // --------------------------------------------------

    val arr  = arrayOf(1,2,3,4) // Type inferred automatically
    println("---- Printing Arrays ----")
    println(arr)                  // object reference
    println(arr.joinToString())  //  readable output

    val arr1 : Array<Int> = arrayOf(1,2,3,4)
    println("---- Printing Arrays ----")
    println(arr1)                  // object reference
    println(arr1.joinToString())  //  readable output


    val arr2  = arrayOf<String>("A","B","C")
    println("---- Printing Arrays ----")
    println(arr2)                      //object reference
    println(arr2.toString())          // object reference
    println(arr2.joinToString())     //  readable output
    println(arr2.contentToString()) //   readable output


    // --------------------------------------------------
    // 2️⃣ Iterating through Arrays
    // --------------------------------------------------

    println("\n---- for-each loop ----")
    for (i in arr2){
        println("element is $i")
    }

    println("\n---- using indices ----")
    for (i in arr2.indices){
        println("index is $i and element is ${arr2[i]}")
    }

    println("\n---- using withIndex() ----")
    for ((i,e)in arr2.withIndex()){
        println("index is $i and element is $e")
    }


    // --------------------------------------------------
    // 3️⃣ Accessing and Modifying Elements
    // --------------------------------------------------

    println("\n---- Get and Set ----")
    println("arr2[2] element is ${arr2.get(2)}")

    arr2[1] = "D"
    arr2.set(2,"F")
    println("After modification: ${arr2[2]}")

    // --------------------------------------------------
    // 4️⃣ Empty and Null Arrays
    // --------------------------------------------------

    // Empty array of Int
    val emptyArr = emptyArray<Int>()
    println("\nEmpty array size: ${emptyArr.size}")

    val users = getUsers()
    println("Total users: ${users.size}")

    // Array of nulls
    val nullArr = arrayOfNulls<String>(3)
    println("Array of nulls: ${nullArr.contentToString()}")

    nullArr[0] = "Hi"
    println("After assigning: ${nullArr.contentToString()}")

    // --------------------------------------------------
    // 5️⃣ Built-in Array Utility Example
    // --------------------------------------------------
    println("\n---- Built-in Functions ----")
    println("First element: ${arr.first()}")
    println("Last element: ${arr.last()}")
    println("Sum of arr: ${arr.sum()}")
}

fun getUsers(): Array<String> {
    // no users found
    return emptyArray()   // instead of return null
}



/*
----------------------------------------------------------
🧠 Notes:
- `arrayOf()` creates an array with specific values.
- `emptyArray<T>()` creates an array of zero size.
- `arrayOfNulls<T>(n)` creates an array that holds `n` null values.
- Arrays are fixed size (use MutableList if you need dynamic size).
- Use `.joinToString()` or `.contentToString()` to print readable values.
- `.indices` gives index range.
- `.withIndex()` gives index + element together.
----------------------------------------------------------
🆚 Java Comparison:
Java: int[] arr = {1, 2, 3, 4};
Kotlin: val arr = arrayOf(1, 2, 3, 4)
----------------------------------------------------------
*/