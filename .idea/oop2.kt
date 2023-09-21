class Fruits {

    var type=""
    var color=""
    var price=0
}

fun main(args: Array<String>) {

//    create object
    var myobj2=Fruits()
    myobj2.type="Banana"
    myobj2.color="Yellow"
    myobj2.price=20
    println(myobj2.type)
    println(myobj2.color)
    println(myobj2.price)
    println("My favorite fruit is ${myobj2.type} its ${myobj2.color} color and cost ${myobj2.price} in Ksh")

    var myobj3=Fruits()
    myobj3.type="Passion"
    myobj3.color="Grey"
    myobj3.price=60
    println("My favorite fruit is ${myobj3.type} its ${myobj3.color} and it cost ${myobj3.price } in Ksh")
}
