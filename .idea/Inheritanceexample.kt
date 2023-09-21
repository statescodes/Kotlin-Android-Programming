import java.time.temporal.TemporalAmount

open class MobileMoneyAccount(
    val accountnumber: String,
    var balance:Double
){
        fun deposit(amount:Double)
        {
            balance +=amount
        }
    open fun withdraw(amount:Double){
        if (balance>=amount){
            balance-=amount
        }else{
            println("Insufficient Balance")
        }
    }
    fun checkbalance():Double{
        return balance
    }

}
class MpesaAccount(
    accountnumber: String,
    balance: Double,
    var phoneNumber:String
):MobileMoneyAccount(accountnumber, balance){

    fun sendmoney(recipient:MpesaAccount,amount: Double){
        if (balance>=amount){
            balance-=amount
            recipient.deposit(amount)
            println("sent $amount KES to ${recipient.phoneNumber}")
        }else{
            println("Insufficient amount")
        }

    }

    override fun withdraw(amount: Double) {
        if (balance>=amount +10.0){
            balance-=amount +10.0
            println("Withdrew $amount KES (Charges 10 Ksh Fee)")

        }else{
            println("Insufficient Balance")
        }
    }
}

fun main(args: Array<String>) {
    var fred= MpesaAccount("234563",1000.0,"0702390612")
    var joan=MpesaAccount("373938",500.0,"078920293")
    fred.sendmoney(joan,200.0)

    println("fred balance: ${fred.checkbalance()}")
    println("joan balance: ${joan.checkbalance()}")

    fred.withdraw(300.0)
    println("fred's balance : ${fred.checkbalance()}")
}
