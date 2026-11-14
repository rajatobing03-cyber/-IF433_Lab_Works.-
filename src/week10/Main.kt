package oop_00000163690_RajaSalomoLumbanTobing.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in kotlin")

    println("isi intBox: ${intBox.value}")
    println("isi stringBox: ${stringBox.value}")
}