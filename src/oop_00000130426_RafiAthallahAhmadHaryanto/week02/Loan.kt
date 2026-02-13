package oop_00000130426_RafiAthallahAhmadHaryanto.week02

import java.util.Scanner

class Loan (val bookTitle: String, val borrowed: String, val loanDuration: Int = 1){
    val denda = calculationFine(loanDuration)
    fun calculationFine(loanDuration: Int): Int = if(loanDuration > 3) return (loanDuration - 3) * 2000 else return 0
}

fun main () {
    val scanner = Scanner(System.`in`)

    print("Judul buku: ")
    val bookTitle: String = scanner.nextLine()
    print("Siapa peminjam: ")
    val borrowed: String = scanner.nextLine()
    print("Berapa hari lama peminjaman: ")
    var loanDuration: Int = scanner.nextInt()
    scanner.nextLine() // free buffer
    loanDuration = if(loanDuration < 0) 1 else loanDuration

    val Loan = Loan(bookTitle, borrowed, loanDuration)
    println("Book Title : ${Loan.bookTitle}")
    println("Borrowed by: ${Loan.borrowed}")
    println("Duration   : ${Loan.loanDuration} hari")
    println("Denda      : Rp ${Loan.denda}")
}