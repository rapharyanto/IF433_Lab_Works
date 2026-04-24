package oop_00000130426_RafiAthallahAhmadHaryanto.week09

fun main() {
    println("=== TEST LAMBDA ===")
    // Syntax Lambda eksplisit: { parameters -> body }
    val sumLambda = { a: Int, b: Int -> a + b}
    println("Haisl Sum: ${sumLambda(5, 10)}")

    // Lambda dengan saut parameter bisa menggunakan implicit 'it'
    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareImplicit(4)}")
}