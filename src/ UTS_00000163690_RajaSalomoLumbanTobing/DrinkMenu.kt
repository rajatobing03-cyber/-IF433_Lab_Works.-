package UTS_00000163690_RajaSalomoLumbanTobing

class DrinkMenu(
    name: String,
    menuCode: String,
    basePrice: Double,
    val isLargeSize: Boolean
) : CateringMenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(quantity: Int): Double {
        val actualPrice = if (isLargeSize) basePrice + 5000.0 else basePrice
        return actualPrice * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val subtotal = calculateSubtotal(quantity)
        val sizeLabel = if (isLargeSize) " (Large)" else ""
        println("[DRINK] $menuCode - $name$sizeLabel")
        println("Qty: $quantity cups | Subtotal: Rp ${formatNumber(subtotal)}")
    }

    private fun formatNumber(amount: Double): String {
        return String.format("%,.0f", amount).replace(',', '.')
    }
}