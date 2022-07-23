fun main() {

    print("Enter num1 : ")
    var num1 = readLine()!!.toInt()   // convert String to Int
    print("Enter num2 : ")
    var num2 = readLine()!!.toLong()

    print("Enter Name : ")
    var name = readLine()

    print("Enter character : ")
    var ch = readLine()!![0]

    var sum = num1+num2
    println("value of sum : $sum")
    println("name : $name")
    println("ch : $ch")
}