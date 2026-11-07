package oop_00000163690_RajaSalomoLumbanTobing.week09

fun main() {
    println("=== TEST LIST ===")
    val frameworks: List<String> = listOf("kotlin", "java", "c++")
    println("immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")
}