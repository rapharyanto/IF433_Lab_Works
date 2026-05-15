package oop_00000130426_RafiAthallahAhmadHaryanto.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
): Exception("Attempt $amount, balance: $balance")