package oop_00000130426_RafiAthallahAhmadHaryanto.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")

        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )

    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path)
            .readLines()
            .mapNotNull { fromCsvTrade(it) }

    } catch (e: FileNotFoundException) {
        println("(Log) File tidak ditemukan: $path")
        emptyList()
    }
}

fun main() {
    fun main() {

        val trades = listOf(
            TradeRecord(1, "BTCUSDT", "LONG", 1500.0, 245.75),
            TradeRecord(2, "ETHUSDT", "SHORT", 1000.0, -120.50),
            TradeRecord(3, "SOLUSDT", "LONG", 750.0, 89.30)
        )

        saveTrades(trades, "crypto_trades.csv")
        println("Data trade berhasil disimpan ke crypto_trades.csv")

        File("crypto_trades.csv")
            .appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

        println("Data korup berhasil ditambahkan")
    }
}