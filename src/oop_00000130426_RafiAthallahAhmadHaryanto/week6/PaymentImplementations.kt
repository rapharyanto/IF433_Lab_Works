package oop_00000130426_RafiAthallahAhmadHaryanto.week6

class Gopay: PaymentMethod {
    override fun pay(amount: Double) { println("Processing Rp$amount via Gopay server" )}
}

class CreditCard: PaymentMethod {
    override fun pay(amount: Double) { println("Contacting Bank for Rp$amount") }
}