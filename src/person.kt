class Person(var name:String,
             var age:Int,
             var gender:String,
             var occupation:String) {

//    var name:String = "Aaki"
//    var age:Int = 19
//    var gender:String = "Male"
//    var occupation:String = "Developer"

    fun getAge(){
        println("My name is $name and I am $age years old")
    }

    fun getGender(){
        println("My name is $name and I am $gender")
    }

}