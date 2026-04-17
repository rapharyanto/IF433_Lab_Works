package practice_Mid

open class Phone  (val on: Boolean, val radio: Boolean) {
    val rapi: String = "0"
    open fun waw() {

    }
    open fun detailInfo() {
        println("=========")
    }
}

class IPhone (val Series: String, val processor: String, val RAM: Int, on: Boolean, radio: Boolean): Phone(on, radio) {
    override fun detailInfo() {
        println("Series: ${Series}")
        println("Processor: ${processor}")
        println("RAM: ${RAM}")
        println("On: ${on}")
        println("Radio: ${radio}")
        super.detailInfo() //memanggil logic function yg asli (parent's function)
    }
}

class Samsung(val Series: String, val processor: String, val RAM: Int, on: Boolean, radio: Boolean): Phone(on, radio) {
    override fun detailInfo() {
        println("Series: ${Series}")
        println("Processor: ${processor}")
        println("RAM: ${RAM}")
        println("On: ${on}")
        println("Radio: ${radio}")
        super.detailInfo() //memanggil logic function yg asli (parent's function)
    }
}

class Xiaomi(val Series: String, val processor: String, val RAM: Int, on: Boolean, radio: Boolean): Phone(on, radio) {
    override fun detailInfo() {
        println("Series: ${Series}")
        println("Processor: ${processor}")
        println("RAM: ${RAM}")
        println("On: ${on}")
        println("Radio: ${radio}")
        super.detailInfo() //memanggil logic function yg asli (parent's function)
    }
}
// tambahan Week 5 | Run-Time Polymorphism
fun main() {
    val phone1 = IPhone("17 Pro", "M5", 16, true, true)
    val phone2 = Samsung("S26 Ultra", "Snapdragon 900", 32, true, true)
    val phone3 = Xiaomi("Poco F4", "Snapdragon 900", 32, true, true)

    val phones = mutableListOf(phone1, phone2, phone3) // Polymorphism Collection
    for(p in phones) { // loop dlu
    when(p) { // Smart Casting w/ is Operator
        is IPhone -> p.detailInfo()
        is Samsung -> p.detailInfo()
        is Xiaomi -> p.detailInfo()
    }
    }
}