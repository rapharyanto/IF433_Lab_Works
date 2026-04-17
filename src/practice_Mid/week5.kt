package practice_Mid

abstract class worker(val name: String) {
    abstract fun work()
}

class IT (name: String) : worker(name) {
    override fun work() {
        println("$name sedang Coding")
    }
}
class Dokter (name: String) : worker(name) {
    override fun work() {
        println("$name sedang Mengobati")
    }
}

fun main() {
    val worker1 = IT("Rap")
    val worker2 = Dokter("Keii")

    val workers = listOf(worker1, worker2)

    for( w in workers ) {
        when(w) {
            is IT -> w.work()
            is Dokter -> w.work()
        }
    }
}