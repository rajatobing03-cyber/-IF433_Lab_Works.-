package oop_00000163690_RajaSalomoLumbanTobing_week02

import java.util.Scanner

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100 // default HP = 100
) {

    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0 // HP tidak boleh minus
        }
        println("$name menerima $damage damage. HP sekarang: $hp")
    }

    fun isAlive(): Boolean {
        return hp > 0
    }

    fun printStatus() {
        println("Hero: $name | HP: $hp | Damage: $baseDamage")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- MINI RPG BATTLE ---")

    print("Masukkan nama Hero 1: ")
    val hero1Name = scanner.nextLine()
    print("Masukkan base damage Hero 1: ")
    val hero1Damage = scanner.nextInt()
    scanner.nextLine()

    print("Masukkan nama Hero 2: ")
    val hero2Name = scanner.nextLine()
    print("Masukkan base damage Hero 2: ")
    val hero2Damage = scanner.nextInt()
    scanner.nextLine()

    val hero1 = Hero(hero1Name, hero1Damage)
    val hero2 = Hero(hero2Name, hero2Damage)

    println("Pertarungan dimulai!")
    hero1.printStatus()
    hero2.printStatus()

    // Loop battle sederhana
    while (hero1.isAlive() && hero2.isAlive()) {
        println("\nGiliran ${hero1.name}")
        hero1.attack(hero2.name)
        hero2.takeDamage(hero1.baseDamage)

        if (!hero2.isAlive()) break

        println("\nGiliran ${hero2.name}")
        hero2.attack(hero1.name)
        hero1.takeDamage(hero2.baseDamage)
    }

    println("\n--- HASIL PERTARUNGAN ---")
    if (hero1.isAlive()) {
        println("${hero1.name} MENANG!")
    } else if (hero2.isAlive()) {
        println("${hero2.name} MENANG!")
    } else {
        println("Keduanya tumbang, seri!")
    }
}
