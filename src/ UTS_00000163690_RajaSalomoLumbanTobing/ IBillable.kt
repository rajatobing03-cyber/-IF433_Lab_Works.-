package UTS_00000163690_RajaSalomoLumbanTobing

interface IBillable {
    fun calculateSubtotal(quantity: Int): Double
    fun printMenuDetails(quantity: Int)
}