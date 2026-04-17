package practice_Mid

import java.util.*
class week1 (){
    //default arguments: memberikan nilai default pada param
    fun greeting(params1: Int, params2: String = "Anonymous") {
        println("Hellow $params2, Ur age is $params1")
    }
}

fun main(args: Array<String>) {

    for (i in 1..1) {
        println("hellow all")
    }

    val scanner = Scanner(System.`in`) //scanner
    val obj1 = week1()
    print("What's ur name darling? ")
    val name = scanner.nextLine()

    print("How old re u? ")
    val age = scanner.nextLine().toInt()

    print("Are you ready? ")
    val jawab = scanner.nextLine()
    var i = 0
    when (jawab) {
        "y" -> {
            do {
                print("[$i]")
                obj1.greeting(params2 = name, params1 = age) //named arguments
                i++
            }while(i < age)
            var mobil: String? = null

            mobil = "Porsche"
            val mobilRapi = mobil?: "F-150 Raptor R"
            //elvis operator: memberikan nilai default, jika null

            if(mobil != null) println("Anda punya mobil $mobil, panjang char: ${mobil?.length}") //Safe Call Operator ?.
            else println("tidak ada mobil")

            if(mobilRapi != null) {
                println("Rapi punya mobil $mobilRapi")
            }
        }
        else -> println("You good!")
    }
}
