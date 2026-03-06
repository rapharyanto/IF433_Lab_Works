package oop_00000130426_RafiAthallahAhmadHaryanto.week05

class EWallet (accountName: String, var balance: Double): PaymentMethod(accountName) {
    override fun processPayment(amount: Double){
        if(balance > amount) {
            val prevBalance = balance
            balance -= amount
            println("Previous Balance: Rp$prevBalance \nAmount: Rp$amount\nCurrent Balance: Rp$balance")
        }
        else println("Saldo tidak cukup")
    }

    fun topUp (amount: Double) {
        val prevBalance = balance
        balance += amount
        println("Previous Balance $prevBalance \nTopUp Amount: Rp$amount\nCurrent Balance Rp$balance\nTopUp Successfully\n")
    }
}