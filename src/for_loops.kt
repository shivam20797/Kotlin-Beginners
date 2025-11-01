
/**
 * Topic: For Loop in Kotlin
 * Author: Aakash
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 * The `for` loop in Kotlin is used to iterate through a range, array, collection, or anything iterable.
 * It’s very similar to a “for-each” loop in Java.
 */

fun main(){


    // --------------------------------------------------
    // 1️⃣ Basic for loop (1 to 10 inclusive)
    // --------------------------------------------------
    println("---- for(k in 1..10) ----")

    for(k in 1..10){
        println("k = $k")
    }

    // --------------------------------------------------
    // 2️⃣ Step value (increment by 2)
    // --------------------------------------------------
    println("---- for(k in 1..10 step 2) ----")
    for(k in 1..10 step 2){
        println("k = $k")
    }

    // --------------------------------------------------
    // 3️⃣ Until keyword (excludes upper limit)
    // --------------------------------------------------

    for(k in 1 until 10){
        println("k = $k")
    }

    // --------------------------------------------------
    // 4️⃣ Reverse iteration (downTo)
    // --------------------------------------------------

    for(k in 10 downTo  1){
        println("k = $k")
    }


    // --------------------------------------------------
    // 5️⃣ Multiplication Table Example
    // --------------------------------------------------

    var num = 16

    for(i in 1..10){
        println("$num*$i = ${num*i}")
    }
}

/*
----------------------------------------------------------
🧠 Notes:
- `1..10` → includes both 1 and 10.
- `1 until 10` → includes 1 but excludes 10.
- `downTo` → used for reverse looping.
- `step` → skips numbers based on step value.

🆚 Java Equivalent Example:
----------------------------------------------------------
for (int k = 1; k <= 10; k++) {
    System.out.println("k = " + k);
}
----------------------------------------------------------
*/