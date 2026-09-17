package oop_00000163690_RajaSalomoLumbanTobing_week02

import java.util.*

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100 // default HP = 100
) {

    fun attack(targetName: String) {
        println("$name menyerang $targetName dengan damage $baseDamage!")
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

    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()
    print("Masukkan base damage Hero: ")
    val heroDamage = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(heroName, heroDamage)
    var enemyHp = 100 // musuh cukup variabel

    println("Pertarungan dimulai!")
    hero.printStatus()
    println("Enemy HP: $enemyHp")

    while (hero.isAlive() && enemyHp > 0) {
        println("\nMenu: 1. Serang, 2. Kabur")
        print("Pilih aksi: ")
        val choice = scanner.nextInt()
        scanner.nextLine()

        if (choice == 1) {
            // Hero menyerang
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Enemy menerima serangan. HP sekarang: $enemyHp")

            // Enemy balas kalau masih hidup
            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy menyerang balik!")
                hero.takeDamage(enemyDamage)
            }
        } else if (choice == 2) {
            println("${hero.name} kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n--- HASIL PERTARUNGAN ---")
    if (hero.isAlive() && enemyHp <= 0) {
        println("${hero.name} MENANG!")
    } else if (!hero.isAlive() && enemyHp > 0) {
        println("Enemy MENANG!")
    } else if (!hero.isAlive() && enemyHp <= 0) {
        println("Keduanya tumbang, seri!")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}