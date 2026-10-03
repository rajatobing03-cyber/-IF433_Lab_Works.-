package oop_00000163690_RajaSalomoLumbanTobing.week06

fun processChekout(method: PaymentMethod, amount: Double) {
    println("-> Memulai chekout...")
    method.pay(amount)
}
fun main() {
    val myWatch = SmartWatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHEKOUT ===")
    processChekout(method = pay1, amount = 50000.0)
    processChekout(method = pay2, amount = 150000.0)
}