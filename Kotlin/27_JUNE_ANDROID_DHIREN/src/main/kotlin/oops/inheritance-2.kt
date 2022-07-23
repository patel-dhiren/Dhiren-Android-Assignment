package oops

// inheritance with Primary Constructor

// primary Constructor
open class Person(
    name:String,
    email:String,
    contact:String
){
    init {
        println("""
            name : $name
            email : $email
            contact :$contact
        """.trimIndent())
    }
}

class Faculty(
    name :String,
    email :String,
    contact:String,
    department:String,
    salary:Double
) : Person(name, email, contact){

    init {
        println("""
            salary : $salary
            department : $department
        """.trimIndent())
    }

}


fun main() {

    var t1 = Faculty("Dhiren", "dhiren@gmail.com", "1231231231", "HR", 1111.11)

}