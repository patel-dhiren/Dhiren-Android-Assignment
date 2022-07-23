package array

fun main() {

    var nums = intArrayOf(23,67,34,23,12)
    var temp = floatArrayOf(324.2f, 45.0f)
    var languages = arrayOf("Java", "Kotlin", "Dart", "Python", "PHP", "Dart")
    var sum = 0


    for(i in nums){
        println(i)
        sum+=i
    }
    println("summation : ${sum+10}")

    // iterate elements
    for(index in languages.indices)
    {
        println(index)
    }

    println("value at index 1 : ${languages[1]}")
    // length
    println("length : ${languages.size}")

    // contains
    if(languages.contains("Dart")){
        println("array contains this value")
    }else{
        println("array does not contains this value")
    }

    // first
    println("${languages.first()}")

    println("*****************")

    // copyRange
    var newArray = languages.copyOfRange(2, 4)

    for(value in newArray) println(value)

    // indexOf
    println("index of Flutter : ${languages.indexOf("PHP")}")

    languages[languages.indexOf("PHP")] = "Flutter" // update value using indexOf method
    for(value in languages) println(value)
}

