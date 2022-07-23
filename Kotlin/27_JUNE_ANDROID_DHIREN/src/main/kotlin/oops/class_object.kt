package oops

class Student{
    // data members or states or attributes
    var id:Int =0
    var name:String = ""
    var email:String = ""
    var course:String = ""
    var age:Int = 0

    constructor(){
        println("constructor called")
    }

    // parameterised constructor
    constructor(id:Int, name:String, email:String, course:String, age:Int){
        this.id =id
        this.name =name
        this.email = email
        this.course = course
        this.age = age
    }

    constructor(id:Int, name:String, email:String, course:String){
        this.id =id
        this.name =name
        this.email = email
        this.course = course
        this.age = age
    }

    // this - its a keyword which refers current class object

    fun setData(id:Int, name:String, email:String, course:String, age:Int)
    {
        this.id =id
        this.name =name
        this.email = email
        this.course = course
        this.age = age
    }

    fun print()
    {
        println("""
            id = $id
            name = $name
            email = $email 
            course = $course
        """.trimIndent())
    }

}

fun main() {



    // object initialization (by reference)
    var s1:Student = Student()      // here Student() - constructorr
    s1.id = 1
    s1.name = "Harshil"
    s1.email = "harshil@gmail.com"
    s1.course = "Android"
    s1.age = 18

    s1.print()

    // object initialization (by method)
    var s2 = Student()
    s2.setData(2, "Mital", "mital@gmail.com", "Java" , 20)
    s2.print()

    // object initialization (by constructor)
    var s3 = Student(12, "Viral", "viral@gmail.com", "PHP", 19)
    s3.print()
}