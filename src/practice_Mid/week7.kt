package practice_Mid

object printing { //singleton method
//    -> characteristik: instant creation, lazy implementation, thread safety
    val text: String = "helloworld"
    fun print() { println(text) }
}

class database() {
    companion object {  //companion object
        val id: Int = 0
        fun connect() { println("Connected!") }
    }
}

data class rapiDetails (val nama: String, var SMT: Int)

enum class hari(val harike: Int){
    senin(1),
    selasa(2)

}
fun main() {
    println(printing.text) //helloworld
    printing.print()       //helloworld

    println(database.id)   //0
    database.connect()     //Connected!
    val d1 = rapiDetails("Rapi", 1)
    val d2 = rapiDetails("keii", 2)

    println(d1) //toString, hashCode(), componentN(), copy(), equals()
    println(d1.equals(d2)) //toString, hashCode(), componentN(), copy(), equals()
    println(d1.hashCode()) //toString, hashCode(), componentN(), copy(), equals()
    println(d1.copy(SMT = 3))
    val (nama, smt) = d1 // componentN / destructuring
    println("$nama $smt")

    println(hari.senin) //senin
    println(hari.senin.harike) //1
}


