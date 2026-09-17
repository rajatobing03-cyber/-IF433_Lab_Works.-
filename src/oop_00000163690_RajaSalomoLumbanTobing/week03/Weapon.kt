package oop_00000163690_RajaSalomoLumbanTobing.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Peringatan: Damage tidak boleh negatif!")
            }