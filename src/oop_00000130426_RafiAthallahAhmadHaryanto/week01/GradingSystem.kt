package oop_00000130426_RafiAthallahAhmadHaryanto.week01

fun main () {
    val name = "Rafi Athallah Ahmad Haryanto"
    val score = 100

    //pake string template ($name)
    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu $grade")
    println("Status: ${calculateStatus(score)}")
}

fun calculateStatus(score: Int) = if (score > 75) "lulus" else "tidak lulus"