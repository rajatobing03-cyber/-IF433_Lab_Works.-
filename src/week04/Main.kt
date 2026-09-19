package oop_00000163690_RajaSalomoLumbanTobing.week04

fun main() {
    val manager = Manager(
        name = "Budi",
        baseSalary = 5000000
    )

    val developer = Developer(
        name = "Andi",
        baseSalary = 5000000,
        programmingLanguage = "Kotlin"
    )

    println("--- Manager ---")
    manager.work()
    println("Bonus Manager: Rp${manager.calculateBonus()}")

    println("\n--- Developer ---")
    developer.work()
    println("Bonus Developer: Rp${developer.calculateBonus()}")
}