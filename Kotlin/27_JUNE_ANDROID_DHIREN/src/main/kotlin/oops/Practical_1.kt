package oops

class Product{

    var id:Int = 0
    var name:String = ""
    var category:String = ""
    var mrp:Double = 0.0
    var salePrice:Double = 0.0
    var offer:Double = 0.0
    var rating:Float = 0.0f
    var likes:Int = 0

    fun print()
    {
        println("""
            id : $id
            name : $name
            mrp : $mrp
            sale price : ${getPrice().toInt()}
        """.trimIndent())
    }

    fun getPrice(): Double
    {
        var dis = mrp*65/100
        salePrice = mrp-dis
        return salePrice
    }

}

fun main() {

    var p1 = Product()
    p1.id = 1
    p1.name = "Street 9"
    p1.category = "Fitted Top"
    p1.mrp = 1599.0
    p1.likes = 2400
    p1.rating = 4.3f
    p1.offer = 65.0

    p1.print()

}