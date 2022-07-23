package oops

class Test{

    fun add(num1:Int, num2:Int){
        println("addition : ${num1+num2}")
    }

    fun add(num1:Float, num2:Int){
        println("addition : ${num1+num2}")
    }


    fun add(num1:Int, num2:Int, num3:Int){
        println("addition : ${num1+num2+num3}")
    }

}

fun main() {

    var t1 = Test()
    t1.add(23.4f,56)
}