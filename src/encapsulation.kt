fun main(){
    abc()
    var instanceA = A()
    instanceA.a = 20
    //instanceA.xyz  don't use outside class
    //instanceA.b = 20 don't use outside class
}

var a = 0;
private  fun abc(){

}

open class A{
    var a = 0
    private var b = 11
    protected  fun xyz(){
        println("b is $b")
    }
}

open class B:A(){
    fun abc(){
        super.a = 20
        super.xyz()
    }
}

// protected not used in class