package oop_00000163690_RajaSalomoLumbanTobing.week09

fun main() {
    println("=== TEST LIST ===")
    val frameworks: List<String> = listOf("kotlin", "java", "c++")
    println("immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1,2,2,3,3,4)
    println("unique Numbers (Set): $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println("Active Users: $activeUsers")

    println("\n=== TEST MAPS ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A"
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apple" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20
    inventory["Apple"] = 45
    println("inventory: $inventory")
}