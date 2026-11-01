package UTS_00000163690_RajaSalomoLumbanTobing

class FoodMenu(
    name: String,
    menuCode: String, basePrice: Double,
    val packagingFee: Double = 3000.0
) : CateringMenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(quantity: Int): Double {
        return (basePrice + packagingFee) * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val subtotal = calculateSubtotal(quantity)
        println("1. [FOOD] $menuCode - $name") // Catatan: getter otomatis menambahkan "UMN-"[cite: 5, 7]
        println("Qty: $quantity portions | Subtotal: Rp ${formatNumber(subtotal)}")
    }

    private fun formatNumber(amount: Double): String {
        return String.format("%,.0f", amount).replace(',', '.')
    }
}