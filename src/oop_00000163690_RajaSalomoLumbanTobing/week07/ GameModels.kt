package oop_00000163690_RajaSalomoLumbanTobing.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(50),
    RARE(25),
    EPIC(10),
    LEGENDARY(1)
}

data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)