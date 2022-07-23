package oops

open class Base{

    // overridden method
    open fun display(){
        println("Base class method called")
    }

}

class Derived : Base()
{

    // overriding method
    override fun display(){
        println("Child class method called")
    }

}

fun main() {

    var d1 = Derived()
    d1.display()

}