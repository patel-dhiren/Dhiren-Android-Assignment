package deicision_making

fun main() {

    var num1 = 23
    var num2 = 54
    var num3 = 67

    var result = if (num1 > num2) {

        if (num1 > num3) {
            "$num1 is largest"
        } else {
            "$num3 is largest"
        }

    } else {

        if (num2 > num3) {
            "$num2 is largest"
        } else {
            "$num3 is largest"
        }


    }


    var res = if(num1>num2){
        "$num1 is greater"
    }else {
        //println("$num2 is greater")
        "$num2 is greater"
    }

    println(res)

    print(result)
}