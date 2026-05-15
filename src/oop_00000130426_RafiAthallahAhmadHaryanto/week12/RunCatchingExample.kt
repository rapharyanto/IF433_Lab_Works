package oop_00000130426_RafiAthallahAhmadHaryanto.week12

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching { "42X".toInt() }
}