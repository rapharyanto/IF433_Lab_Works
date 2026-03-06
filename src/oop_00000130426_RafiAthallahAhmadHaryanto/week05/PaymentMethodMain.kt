package oop_00000130426_RafiAthallahAhmadHaryanto.week05

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    print("Please input your account name: ")
    val accName = scanner.nextLine()

    val CC = CreditCard(accName, 100000.0)
    val EW = EWallet(accName, 50000.0)
    val ListOfPaymentMethod: List<PaymentMethod> = listOf(CC, EW)
    println("\n=== USER DATA ===")
    println("Account Name: $accName")

    println("\n=== PAYMENT METHOD ===")
    for(listPM in ListOfPaymentMethod) {
        when(listPM) {
            is CreditCard -> {
                println("1. Payment with Credit Card")
                listPM.processPayment(75000.0)
            }
            is EWallet -> {
                println("\n2. Payment with E-Wallet")
                listPM.topUp(50000.0)
                listPM.processPayment(75000.0)
            }
        }
    }
}