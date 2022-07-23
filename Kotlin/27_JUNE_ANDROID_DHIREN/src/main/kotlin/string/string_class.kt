package string

fun main() {
    // String - sequence of character
    var name = "tops technologies"

    for(ch in name){
        print("$ch ")
    }

    // length
    println("\nlength of name : ${name.length}")

    // equals
    var str1 = "Tops"
    var str2 = "tops"

    if(str1.equals(str2, ignoreCase = true)){
       println("both are equal")
    }else
        println("both are different")

    var str3 = "Tops Technologies"
    println("uppercase : ${str3.uppercase()}")
    println("lowercase : ${str3.lowercase()}")
    println("value of str3 : ${str3}")

    // get
    println("char at index 9 : ${str3.get(9)}")

    // substring
    println("${str3.substring(3..10)}")
    println("${str3.substring(5)}")
    println("${str3.substring(5, 10)}")

    // trim
    var userName = "Dhiren Patel  "
    println(userName.trim().length)

    // replace
    println("${userName.replace("dhiren", "Hiren", ignoreCase = true)}")

    var path = "C:\\Android\\Java\\sample.txt"

    println("index of \\ : ${path.indexOf("\\")}")
    println("index of \\ : ${path.lastIndexOf("\\")}")

    println(path.substring(path.lastIndexOf("\\")+1))

    //println(path.substring(path.lastIndexOf("\\")+1))
    //println("index of p : ${userName.indexOf("P")}")

}