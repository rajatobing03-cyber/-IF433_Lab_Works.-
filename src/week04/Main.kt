package oop_00000163690_RajaSalomoLumbanTobing.week04

fun main() {
    println("--- Manager ---")
    val manager = Manager(
        name = "Budi",
        baseSalary = 5000000
    )

    manager.work()
    println("Bonus Manager: Rp${manager.calculateBonus()}")

    println("\n--- Developer ---")
    val developer = Developer(
        name = "Andi",
        baseSalary = 5000000,
        programmingLanguage = "Kotlin"
    )

    developer.work()
    println("Bonus Developer: Rp${developer.calculateBonus()}")

    println("\n--- Electric Car ---")
    val electricCar = ElectricCar(
        brand = "Tesla",
        numberOfDoors = 4,
        batteryCapacity = 80
    )

    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()
}