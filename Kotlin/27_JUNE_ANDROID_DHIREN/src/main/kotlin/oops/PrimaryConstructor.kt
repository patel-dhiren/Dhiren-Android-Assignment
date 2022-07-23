package oops

// Primary Constructor
class Employee(empId:Int, name:String , salary:Double, department:String)
{
    // init block
    init {
        println("""
            id : $empId
            name : $name
            salary : $salary
            department : $department
        """.trimIndent())
    }

}

fun main() {

    var e1 = Employee(12, "Ajay", 34500.5, "HR")

}