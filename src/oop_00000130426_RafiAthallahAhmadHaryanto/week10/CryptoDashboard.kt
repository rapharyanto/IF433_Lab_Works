package oop_00000130426_RafiAthallahAhmadHaryanto.week10

fun main() {
    val coinRepo = WalletRepository <Coin>()

    coinRepo.add(Coin("BTC", 0.75))
    coinRepo.add(Coin("ETH", 2.5))
    coinRepo.add(Coin("USDT", 1500.0))

    println("=== Wallet Coins ===")
    val response = ApiResponse(
        "200 OK",
        coinRepo.getAll()
    )
    println("Status: ${response.status}")

    println("\n=== Coin Data ===")
    response.data.forEach {
        println("${it.name} : ${it.balance}")
    }
}