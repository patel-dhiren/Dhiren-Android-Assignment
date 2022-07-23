package deicision_making

fun main() {

    var num = 14

    var result = when(num){
        0,11 -> "0 or 11"
        in 1..10  -> "1 to 10 (range)"
        !in 12..14 -> "not from range 12..14"
        else -> "invalid number"
    }

    println(result)

}