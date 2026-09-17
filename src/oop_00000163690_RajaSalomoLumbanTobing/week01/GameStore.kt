package oop_00000163690_RajaSalomoLumbanTobing_week01

fun main() {
    val title = "Cyberpunk 2077"
    val price = 600000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(title = title, finalPrice = finalPrice)

    val noteText = userNote ?: "Tidak ada catatan"
    println("Catatan: $noteText")
}

fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()

fun printReceipt(title: String, finalPrice: Int) {
    println("=== STRUK PEMBELIAN STEAMKW ===")
    println("Judul Game: $title")
    println("Harga Akhir: Rp $finalPrice")
}