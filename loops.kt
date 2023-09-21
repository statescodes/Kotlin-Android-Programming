fun main(args: Array<String>) {

    for (i in 5..15){
        println("Loop :$i")
    }
//    var myarrry= arrayOf("Kenya","Uganda","Tanzania","Ethiopia")
    var myarrry= listOf("Kenya","Uganda","Tanzania","Ethiopia")
    for (x in  myarrry){
        println(x)
    }
    for (a in 0..10){
        println("Loop :$a")
    }
}

// find the maximum element in an array using a function
//[12,45,67,23,56,68,90,13]