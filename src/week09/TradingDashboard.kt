package oop_00000163690_RajaSalomoLumbanTobing.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 12.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -4.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 15, 8.7, "OPEN"),
        TradeLog("SOLUSDT", "SHORT", 25, -2.8, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 30, 15.6, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 10, -6.3, "CLOSED")
    )

    println("=== TRADE HISTORY ===")
    tradeHistory.forEach { println(it) }

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    println("\n=== CLOSED TRADES ===")
    println("Jumlah Closed Trade: ${closedTrades.size}")
    closedTrades.forEach { println(it) }

    val winningTrades = closedTrades.filter { it.roe > 0 }

    println("\n=== WINNING TRADES ===")
    winningTrades.forEach { println(it) }

    val losingTrades = closedTrades.filter { it.roe <= 0 }

    println("\n=== LOSING TRADES ===")
    losingTrades.forEach { println(it) }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    println("\n=== TOP PERFORMERS ===")
    topPerformersString.forEach { println(it) }
}