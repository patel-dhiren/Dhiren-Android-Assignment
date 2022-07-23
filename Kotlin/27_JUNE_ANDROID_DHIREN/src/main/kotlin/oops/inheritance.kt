package oops
// inheritance with Secondary Constructor
open class User {        // parent class

    protected var name: String = ""
    protected var email: String = ""
    protected var contact: String = ""

    constructor(name: String, email: String, contact: String) {
        this.name = name
        this.email = email
        this.contact = contact
    }

}

class Teacher : User       // Child class or derived class
{

    var department: String = ""
    var salary: Double = 0.0

    constructor(name: String, email: String, contact: String, department: String, salary: Double) : super(name, email, contact)
    {
        this.department = department
        this.salary = salary
    }


    fun show() {
        println(
            """
            name : $name
            email : $email
            contact : $contact
            salary : $salary
            department : $department
        """.trimIndent()
        )
    }

}

fun main() {

    var t1 = Teacher("Dhiren", "dhiren@gmail.com", "1231231231", "HR", 1111.11)

    t1.show()

}