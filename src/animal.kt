/**
 * Animal class demonstrates Primary and Secondary Constructors
 */
class Animal(var name: String, var age: Int, var breed: String, color: String) {
    var color: String = color


    // Secondary Constructor
    constructor(animalName: String, animalColor: String) : this(animalName, 1, "Jersey", animalColor)

    // init block runs when object is created. It will run automatically
    init {
        println("Name of the animal is $name")
    }

    init {
        println("Bread of the animal is $breed")
    }

}

class Demo public  constructor(var name:Int){

}
