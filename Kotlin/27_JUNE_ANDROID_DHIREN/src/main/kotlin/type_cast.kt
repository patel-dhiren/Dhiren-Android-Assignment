fun main() {

    var s = "45"
    var n = 12

    println(s.toInt()+n)        // 4512

    var num1:Int = 23
    var num2:Long = num1.toLong()   // int to long

    var str:String = num2.toString()    // long to string

    println("$num1+$num2")      // 23+23
    println("${num1+num2}")     // 46
    println("${str.toInt()+num1}")      // 2323
    println("$str+$num2")       // 23+23

}