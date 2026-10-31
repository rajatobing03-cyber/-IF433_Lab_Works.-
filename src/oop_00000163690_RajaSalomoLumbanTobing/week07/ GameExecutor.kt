package oop_00000163690_RajaSalomoLumbanTobing.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            val (monsterName) = event
            println("Monster muncul: $monsterName! Bersiap untuk bertarung!")
        }

        is BattleState.LootDropped -> {
            val (item) = event
            println("Loot didapatkan: ${item.name}")
            println("Damage: ${item.damage}")
            println("Rarity: ${item.rarity}")
            println("Drop chance: ${item.rarity.dropChance}")
        }

        is BattleState.GameOver -> {
            val (reason) = event
            println("Game Over: $reason")
        }

        BattleState.SafeZone -> {
            println("Kamu berada di zona aman. Tidak ada monster di sekitar.")
        }
    }
}