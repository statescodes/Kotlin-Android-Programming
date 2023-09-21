class Students(val name:String,val Age:Int,val gender:String){

}

fun main(args: Array<String>) {
//    create object
    val stu1=Students("Fred", 40, "Male")
    val stu2=Students("Munene", 80, "Male")
    val stu3=Students("Diana", 70, "Female")

    println("Student name is ${stu1.name} and age is ${stu1.Age} is a ${stu1.gender}")
    println("Student name is ${stu2.name} and age is ${stu2.Age} is a ${stu2.gender}")
    println("Student name is ${stu3.name} and age is ${stu3.Age} is a ${stu3.gender}")

}