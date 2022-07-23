package oops

open class A{

    private var a = 10

     fun showA()
    {
        println("value of a : $a")
    }

}

open class B : A(){

    var b = 20

    fun showB()
    {
        showA()
        println("value of b : $b")
    }

}

class C : A(){

    var c = 30

    fun showC()
    {
        println("value of c : $c")
    }

    fun add(num1:Int, num2:Int){

    }

}

fun main() {

    var objA = A()
    objA.showA()

    println("**************")

    var objB = B()
    objB.showA()
    objB.showB()

    println("**************")

    var objC = C()
    objC.showA()
    //objC.showB()
    objC.showC()
    //objC.add(23.0f, 11.43f)
}