package functions
// Named Function -


fun main() {

    // countries("India", "China", "Australia")
    countries(code = 123, c3 = "Australia", c1 = "India", c2 = "China")
}

fun countries(c1:String, c2:String,  c3:String,  code:Int = 0)     // Default Argument function
{
    println("c1 : $c1")
    println("c2 : $c2")
    println("c3 : $c3")
    println("code : $code")
}