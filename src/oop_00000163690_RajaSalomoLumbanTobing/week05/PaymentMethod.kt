package oop_00000163690_RajaSalomoLumbanTobing.week05

abstract class PaymentMethod(
    val accountName: String
) {
    abstract fun processPayment(amount: Double)
}