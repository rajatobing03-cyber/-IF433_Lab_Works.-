package oop_00000163690_RajaSalomoLumbanTobing.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connetionStatus}")
    DatabaseManager.connet()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}