package practice_Mid

private class User(val name: String) { //primary constructor
    val age = 10
    constructor( name: String, age: Int ): this(name) { //secondary constructor
        println("Secondary Constructor")
        println("Nama User: $name, Umur: $age")
    }

    private constructor( name: String, alamat: String): this(name) { //secondary constructor juga
        println("Secondary Constructor 2")
        println("Nama User: $name, alamat: $alamat")
    }
}

class Student (public val name: String, private val gpa: Double) {
    internal val a = "rapi"
    fun print() {
        println(a) //rapi
    }
}
fun main() {
    val S = Student("rapi", 121.2)
    S.print()
    println(S.a)
}