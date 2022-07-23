package looping

fun main() {

    for(num in 1..10) {
        print("$num  ")
    }

    println()

    for(num in 10 downTo 1){
        print("$num  ")
    }

    println()

    for(i in 0 until 10){
        print("$i  ")
    }

    println()

    for(i in 10..30 step 3){
        print("$i  ")
    }

}