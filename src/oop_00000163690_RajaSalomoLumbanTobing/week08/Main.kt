package oop_00000163690_RajaSalomoLumbanTobing.week08

fun main() {

    println("== TEST SAFE CALLS & ELVIS ==")

    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name
        ?: "Kota Tidak Diketahui"

    println("Tujuan pengiriman : $destination")

    println("\n=== TEST LET BLOCK ===")

    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"

    println(receipt)

    println("\n== TEST SAFE CASTING ===")

    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "laptop",
        4500000.0
    )

    for (item in mixedData) {
        val text = item as? String

        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

    // LANGKAH 3: Safe Cast + Elvis Fallback
    for (item in mixedData) {
        val productName = item as? String ?: "BUKAN PRODUK STRING"
        println(productName)
    }
}