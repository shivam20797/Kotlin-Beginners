class Animal(var name: String, var age: Int, var breed: String, color: String) {
    var color: String = color


    // Secondary Constructor
    constructor(animalName: String, animalColor: String) : this(animalName, 1, "Jersey", animalColor)


    // Init blocks run automatically
    init {
        println("Name of the animal is $name")
    }

    init {
        println("Bread of the animal is $breed")
    }

}
