/**
 * Topic: Loops in Kotlin
 * Author: Aakash
 * Part of: Git Series for Kotlin Beginners
 *
 * Description:
 * Loops are used when you want to execute a block of code multiple times.
 * Kotlin provides several types of loops:
 *  - while loop
 *  - do-while loop
 *
 */


fun main(){
    // --------------------------------------------------
    // 1️⃣ while loop
    // --------------------------------------------------
    // Executes a block of code *while* the condition is true.
    // If the condition is false at the start, it won't run at all.
    var i = 1
    println("---- while loop (increasing i) ----")
    while (i<=5){
        println("i = $i")
        i++ // Increment to avoid infinite loop
    }
    var j= 5
    println("---- while loop (decreasing j) ----")
    while (j>0){
        println("j = $j")
        j-- // Decrement to avoid infinite loop
    }



    // --------------------------------------------------
    // 2️⃣ do-while loop
    // --------------------------------------------------
    // Executes the block *once first*, then checks the condition.
    // Useful when you want at least one execution.

    println("---- do-while loop (increasing i) ----")

    do {
        println("i = $i")
        i++
    }while (i<=5)
    println("---- do-while loop (decreasing j) ----")
    do {
        println("j = $j")
        j--
    }while (j>0)

}

/*
----------------------------------------------------------
🧠 Notes:
- `while` checks the condition first → may not run at all.
- `do-while` runs at least once even if the condition is false.
- Always include increment/decrement inside the loop,
  otherwise it becomes an infinite loop.

🆚 Example Comparison
----------------------------------------------------------
Java:
while (i <= 5) {
    System.out.println(i);
    i++;
}

Kotlin:
while (i <= 5) {
    println("i = $i")
    i++
}
----------------------------------------------------------
*/