package string

fun main() {

    var languages = arrayOf("Java", "Kotlin", "Dart", "PHP", "Java Script", "python")

    for(value in languages){

        if(value.contains("va", ignoreCase = true)){
            println(value)
        }

        /*if(value.startsWith("p", ignoreCase = true)){
            println(value)
        }*/

    }

}