fun main(args: Array<String>) {
    val sum= {num1:Int,num2:Int -> num1+num2}
    val product= {num1:Int,num2:Int -> num1*num2}
    val difference= {num1:Int,num2:Int -> num1*num2}
    val quotient= {num1:Int,num2:Int -> num1*num2}
// inline function
    println("8+7 =${sum(8,7)}")
    println("8*7 =${sum(8,7)}")
    println("8/7 =${sum(8,7)}")
    println("8-7 =${sum(8,7)}")


}