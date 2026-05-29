package oop_00000130426_RafiAthallahAhmadHaryanto.week14

interface Printable {
    fun print(doc: String)
}

interface Scanner {
    fun scan(doc: String): String
}

class ModernSimplePrinter: Printable {
    override fun print(doc: String) = println("Printing securely: $doc")
}