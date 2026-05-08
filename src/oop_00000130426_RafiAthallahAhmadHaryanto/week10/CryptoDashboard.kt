package oop_00000130426_RafiAthallahAhmadHaryanto.week10

fun main() {
    val coinRepo = WalletRepository <Coin>()

    coinRepo.add(Coin("BTC", 0.75))
    coinRepo.add(Coin("ETH", 2.5))
    coinRepo.add(Coin("USDT", 1500.0))

    println("=== Wallet Coins ===")

    coinRepo.getAll().forEach {
        println("${it.name} : ${it.balance}")
    }
}