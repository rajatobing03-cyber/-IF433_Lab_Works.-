package oop_00000163690_RajaSalomoLumbanTobing.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Peringatan: Damage tidak boleh negatif!")
            } else if (value > 1000) {
                println("Peringatan: Damage melebihi 1000! Dipatok ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}