package oop_00000130426_RafiAthallahAhmadHaryanto.week13
import java.io.File

fun main() {
    println("=== TEST WRITE ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisialisasi sistem. \n")
    println("File berhasil dibuat dan ditulis.")
}