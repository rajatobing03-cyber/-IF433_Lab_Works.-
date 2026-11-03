package oop_00000163690_RajaSalomoLumbanTobing.week08

fun main() {
    println("== TEST SAFE CALLS & ELVIS ==")

    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name
        ?: "Kota Tidak Diketahui"

    println("Tujuan pengiriman : $destination")

    println("\n=== TEST LET BLOCK ===")

    val validOrder = Order(null, 250000.0)

    val receipt = validOrder.totalPrice?.let { price ->
        // Blok ini hanya jalan jika totalPrice tidak null
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"

    println(receipt)

    println("\n== TEST SAFE CASTING  ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi",null),
        "laptop",
        4500000.0
    )
}