package null_safety

fun main() {
    var name:String? = null // nullable object

    println("length : ${name?.length}")     // ?. Null safe operator

   /* var result = if(name!=null)
    {
        "length : ${name.length}"
    }else{
        null
    }

    println(result)*/

    if(name!=null)
        println("toUpperCase : ${name!!.uppercase()}")      // Not null assertion

    // elvish operator (?:)

    var temp = name?: "unknown"
    println(temp)

}