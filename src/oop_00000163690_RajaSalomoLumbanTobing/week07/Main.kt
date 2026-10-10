package oop_00000163690_RajaSalomoLumbanTobing.week07

fun main() {
    // ========================================
    // TEST SINGLETON
    // ========================================
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connetionStatus}")
    DatabaseManager.connet()

    // ========================================
    // TEST COMPANION OBJECT
    // ========================================
    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    // ========================================
    // TEST REGULAR CLASS
    // ========================================
    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)

    println(reg1)
    println("Sama? ${reg1 == reg2}")

    // ========================================
    // TEST DATA CLASS
    // ========================================
    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)

    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    // ========================================
    // TEST SEALED CLASS: API RESPONSE
    // ========================================
    println("\n=== TEST SEALED CLASS ===")

    val response: ApiResponse =
        ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when (response) {
        is ApiResponse.Success ->
            "Tampilkan: ${response.data}"

        is ApiResponse.Error ->
            "Munculkan alert: ${response.message}"

        ApiResponse.Loading ->
            "Tampilkan Spinner"
    }

    println(uiMessage)

    // ========================================
    // TEST GAME MANAGER SINGLETON
    // ========================================
    println("\n=== TEST GAME MANAGER SINGLETON ===")

    GameManager.startGame()
    GameManager.startGame()

    // ========================================
    // TEST ENUM RARITY
    // ========================================
    println("\n=== TEST ENUM RARITY ===")
    println(
        "Legendary drop chance: ${ItemRarity.LEGENDARY.dropChance}"
    )

    // ========================================
    // TEST WEAPON FACTORY
    // ========================================
    println("\n=== TEST WEAPON FACTORY ===")

    val starterSword = Weapon.forgeStarterSword()

    println("Nama senjata: ${starterSword.item.name}")
    println("Damage: ${starterSword.item.damage}")
    println("Rarity: ${starterSword.item.rarity}")
    println("Drop chance: ${starterSword.item.rarity.dropChance}")
    println("Durability: ${starterSword.durability}")

    // ========================================
    // TEST BLACKSMITH UPGRADE
    // ========================================
    println("\n=== TEST BLACKSMITH UPGRADE ===")

    // Membuat salinan pedang dengan damage yang ditingkatkan.
    val upgradedSwordItem = starterSword.item.copy(damage = 25)

    println("Pedang awal: ${starterSword.item}")
    println("Pedang setelah upgrade: $upgradedSwordItem")

    // ========================================
    // TEST BATTLE EVENT SEQUENCE
    // ========================================
    println("\n=== TEST BATTLE EVENT SEQUENCE ===")

    // 1. Pemain memasuki zona aman.
    processEvent(BattleState.SafeZone)

    // 2. Pemain bertemu monster.
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))

    // 3. Pemain mendapatkan loot berupa pedang hasil upgrade.
    processEvent(BattleState.LootDropped(upgradedSwordItem))

    // 4. Permainan berakhir.
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}