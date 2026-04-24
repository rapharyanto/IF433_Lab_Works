package oop_00000130426_RafiAthallahAhmadHaryanto.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 12.5, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 5, -3.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 20, 8.7, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 15, -6.5, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 8, 4.1, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 12, -2.0, "CLOSED")
    )

    // Contoh print data (opsional buat cek)
    tradeHistory.forEach {
        println(it)
    }

    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }

    // Cek hasil
    closedTrades.forEach {
        println(it)
    }

    val winningTrades = closedTrades
        .filter { it.roe > 0 }

    // Cek hasil
    winningTrades.forEach {
        println(it)
    }

    val losingTrades = closedTrades
        .filter { it.roe <= 0 }

    // Cek hasil
    losingTrades.forEach {
        println(it)
    }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    // Cek hasil
    topPerformersString.forEach {
        println(it)
    }
}