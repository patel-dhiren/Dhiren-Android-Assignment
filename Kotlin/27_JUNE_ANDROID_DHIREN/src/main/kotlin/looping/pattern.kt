package deicision_making

/*
*
**
***
****
******/

fun main() {

    var counter = 1

    for(i in 1..5){

        for(j in 1..i){
            print(counter)
            counter++
        }

        println()
    }

}