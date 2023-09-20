fun main(args: Array<String>){
     val chr='A'
    when(chr){



    'A','E','I','O','U' -> println("$chr is a vowel")
    else -> println("$chr is a consonant")
}
val mynum=78
when(mynum){
    in 1..9-> println("$mynum is a single digit number")
    in 10..99-> println("$mynum is a double digit number")
    in 100..999-> println("$mynum is a three digit number")

    else-> println("$mynum has more than three digits")
}

}