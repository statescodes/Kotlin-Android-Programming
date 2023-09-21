open class Ourparent{
    val dad= "Like watching Hiking"
    val mum="Like cooking"

}
class Boychild:Ourparent(){

    fun mvulana(){
        println(dad)
    }

}
class Girlchild:Ourparent(){
    fun msichana(){
        println(mum)
    }
}

fun main(args: Array<String>) {
    val myobj=Boychild()
    myobj.mvulana()
    val myobj2=Girlchild()
    myobj2.msichana()
}