package deicision_making

fun main() {

    var marks = 356
    var subject = 5

    var avg = marks/subject.toFloat()

    var result = if(avg>=75){
        "A Grade"
    }else if(avg>=60 && avg<75){
        "B Grade"
    }else if(avg>=45 && avg<60){
        "C Grade"
    }else{
        "Failed"
    }

    println(result)

}