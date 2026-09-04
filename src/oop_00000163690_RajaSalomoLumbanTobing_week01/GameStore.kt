package oop_00000163690_RajaSalomoLumbanTobing_week01

package week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000
}
fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000
}
fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, finalPrice: Int) {
    println("Judul Game  : $title")
    println("Harga Akhir : Rp$finalPrice")
}

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}