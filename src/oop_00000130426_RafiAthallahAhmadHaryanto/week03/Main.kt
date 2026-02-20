package oop_00000130426_RafiAthallahAhmadHaryanto.week03

fun main() {
    val e = Employee("Rafi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}