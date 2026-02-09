package oop_00000130426_RafiAthallahAhmadHaryanto.week01

fun main () {
    val gameTitle: String = "Call of Duty: Black Ops 7"
    val price: Int = 1200000
    printReceipt(title = gameTitle, finalprice = calculateDiscount(price = price))
}

fun calculateDiscount(price: Int): Int {
    if(price > 50000) {
           return price - (price * 20 / 100)
    }else{
        return price - (price * 10/100)
    }
}

fun printReceipt (title: String, finalprice: Int) {
    println("Game Title $title\nFinal Price: Rp $finalprice")
}

