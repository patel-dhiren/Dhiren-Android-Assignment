fun main() {

    var num1 = 23   // Int
    var num2 = 3    // Int

    var result = num1/num2.toFloat()    // casting int to float
    println("result : $result")

    var rem = num1%10
    println("value of rem : ${num1%10}")

    var ch = 'A'
    println("ASCII value of ch : ${ch.toInt()}")

    // Assignment Operators (+=,-=., *=, /=, %=)
    var num = 10
    num+=20       //num = num+20
    //println(num)

    //Increment / Decrement Operators (++, --)
    //println(num++)      // postfix
    println(++num)
    println("value after increment : $num")

    // Comparison and Equality Operators (>, <, !=, ==, >=, <=)

    var n1 = 60

    println(n1>100)
    println(n1<100)
    println(n1==34)
    println(n1!=34)

    // Logical Operator (&&, ||, !)
    println(n1>50 && n1<100)    // true
    println(n1>0 && n1%5==0)
    println(n1%2==0 || n1%7==0)     // true
    println(!(n1>10))
}