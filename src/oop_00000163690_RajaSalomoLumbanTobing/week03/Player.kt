package oop_00000163690_RajaSalomoLumbanTobing.week03

class Player(val username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1
