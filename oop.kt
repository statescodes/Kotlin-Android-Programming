class Example {

//    data member
    private var number:Int=9

//member function

    fun calculatesquare():Int{

        return number*number
    }
}

fun main(args: Array<String>) {

//    creating an object of Example class

    val myobj=Example()

    println("The square is ${myobj.calculatesquare()}")
}
