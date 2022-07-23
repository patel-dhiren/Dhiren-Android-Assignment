package functions

fun main() {

    var  fact1 = factorial(3)     // calling function
    var fact2 = factorial(7)

    println("factorial : $fact1")
    println("factorial : $fact2")
    println("factorial : ${factorial(9)}")

}

//without return and with parameter
// function definition
fun factorial(num:Int) : Int
{
    var fact = 1

    for(i in 1..num)
    {
        fact*=i
    }
    return fact
}
