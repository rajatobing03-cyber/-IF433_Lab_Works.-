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
}