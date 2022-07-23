package deicision_making

fun main() {

    var num1 =34
    var num2 = 5


    println("""
        1) addition
        2) subtraction
        3) division 
        4) multiplication
    """.trimIndent())

    print(" Enter your choice : ")
    var choice = readLine()!!.toInt()

    when(choice){
        1 -> println("addition : ${num1+num2}")
        2 -> {
            println("subtraction : ${num1-num2}")
        }
        3 -> println("division : ${num1/num2.toFloat()}")
        4 -> println("multiplication : ${num1*num2}")
        else -> println("invalid input")
    }

}