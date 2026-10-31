package oop_00000163690_RajaSalomoLumbanTobing.week05

class CreditCard(
    accountName: String,
    val limit: Double,
    var usedAmount: Double = 0.0
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran sebesar Rp$amount berhasil.")
            println("Total penggunaan: Rp$usedAmount")
            println("Sisa limit: Rp${limit - usedAmount}")
        } else {
            println("Transaksi ditolak: melebihi limit.")
        }
    }
}