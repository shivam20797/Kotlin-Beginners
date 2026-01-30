# Kotlin for Beginners — Step-by-Step Learning Series

Welcome to the **Kotlin Learning Series** — a complete guide for beginners who want to learn Kotlin in a simple, structured way.

This repository contains practical `.kt` files and documentation designed for **junior developers**, explaining Kotlin concepts with **Java comparisons**, **code examples**, and **clear explanations**.

---

## About Kotlin

Kotlin is a **statically typed**, modern programming language developed by **JetBrains in 2011**.  
It was officially supported by **Google as a first-class language for Android development in 2017**.

Kotlin runs on the **Java Virtual Machine (JVM)**, and can also target:
- ☕ Java applications
- 📱 Android apps
- 🌐 JavaScript (frontend / backend)
- 💻 Server-side development
- 🧩 Multiplatform (via Kotlin Multiplatform)

---

## Key Features of Kotlin

| Feature | Description |
|--------|-------------|
| **Statically Typed** | Types are checked at compile time to reduce errors |
| **Type Inference** | Compiler automatically detects variable types |
| **Concise Syntax** | Less boilerplate compared to Java |
| **Null Safety** | Helps prevent `NullPointerException` |
| **Data Classes** | Simplified classes for holding data |
| **Extension Functions** | Add functions to existing classes |
| **Java Interoperability** | Use Java libraries directly |
| **Functional Programming** | Lambdas and higher-order functions |
| **Coroutines** | Simplified async and multithreaded code |
| **Jetpack Compose** | Modern UI toolkit for Android |

---

## Kotlin in Android Development

- Officially supported by Google
- Works with **Jetpack libraries**
- Uses **Jetpack Compose** instead of XML
- Coroutines simplify background tasks
- Supports **multiplatform development**

---


## Kotlin Compilation Flow

| Source File | Compiler | Output |
|------------|----------|--------|
| `.kt` | `kotlinc` | `.class` (JVM bytecode) |
| `.java` | `javac` | `.class` (JVM bytecode) |

🧩 Both Kotlin and Java ultimately run on the **JVM**, so you need to install **JDK (Java Development Kit)** to compile Kotlin.

---

## Tools & Environments

### IDEs (Recommended)
- **IntelliJ IDEA** — by JetBrains (best choice for Kotlin beginners)
- **Android Studio** — for Android app development
- **VS Code** — with Kotlin plugin

### Online Kotlin Runners
- [JDoodle](https://www.jdoodle.com/)
- [Kotlin Playground](https://play.kotlinlang.org/)

### Command-Line Compilation

```bash
kotlinc main.kt -include-runtime -d main.jar
java -jar main.jar
```

Kotlin-Beginners/
│
├── 📄 README.md            
│
├── Main.kt                # Program entry point
├── hello_world.kt         # print() and println()
├── variables.kt           # var vs val, data types
├── operator.kt            # Arithmetic, assignment, relational, logical operators
├── conditional.kt         # if-else and expression-based logic
├── when_stmt.kt           # Kotlin's switch alternative
├── while_loop.kt          # while loop
├── for_loops.kt           # for loop
├── functions.kt           # reusable block of code that performs a specific task
├── array.kt               # Arrays
├── class_objects.kt       # Class objects and constructor
├── getter_setter.kt       # get and set predefine and custom functions
├── exm_inheritance.kt     # Inheritance
├── exm_polymorphism.kt    # Polymorphism => Run time polymorphism by override method
├── exm_abstraction.kt     # Abstraction & Interface
├── encapsulation.kt       # Encapsulation
├── inner_classes.kt       # Nested Classes
├── data_class.kt          # Data Class
├── sealed_class.kt        # Sealed Class
├── enum_class.kt          # Enum Class
├── object_expr.kt         # Singleton & Anonymous objects
├── companion.kt           # Companion objects
├── extension.kt           # Add new functions to existing classes

