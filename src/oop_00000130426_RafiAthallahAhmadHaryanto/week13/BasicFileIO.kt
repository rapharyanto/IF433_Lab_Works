package oop_00000130426_RafiAthallahAhmadHaryanto.week13
import java.io.File

fun main() {
    println("=== TEST WRITE ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisialisasi sistem. \n")
    println("File berhasil dibuat dan ditulis.")

    file.appendText("Line 2: Menambahkan konfigurasi baru. \n")
    println("Teks berhasil di-append.")

    println("=== TEST READ FILE ===")
    val fullContent = file.readText()
    println("Membaca sekaligus:\n$fullContent")

    println("=== TEST READ LINES ===")
    val lines = file.readLines()
    lines.forEachIndexed { index, line ->
        println("Isi Index $index: $line")
    }
}