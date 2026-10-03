package oop_00000163690_RajaSalomoLumbanTobing.week06

class Gopay : PaymentMethod {
    override fun play(amount: Double) { println("Processing Rp$amount via Gopay Server") }
}

class CreaditCard : PaymentMethod {
    override fun play(amount: Double) { println("Contacting Bank Rp$amount") }
}