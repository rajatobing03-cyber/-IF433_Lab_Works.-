package UTS_00000163690_RajaSalomoLumbanTobing

class CateringOrder(
    val customer: Customer,
    var status: OrderStatus = OrderStatus.WAITING_LIST
) {
    private val orderItems: MutableList<Pair<CateringMenu, Int>> = mutableListOf()

    fun addMenuToOrder(menu: CateringMenu, qty: Int) {
        orderItems.add(Pair(menu, qty))
        println("Order successfully added!")
    }

    fun printInvoice() {
        println("================ INVOICE ================")
        println("Customer: ${customer.name} (${customer.phone})")
        println("Delivery Address: ${customer.deliveryAddress}")
        println("Order Status: $status")

        var grandTotal = 0.0
        for ((index, itemPair) in orderItems.withIndex()) {
            val menu = itemPair.first
            val qty = itemPair.second
            val subtotal = menu.calculateSubtotal(qty)
            grandTotal += subtotal

            print("${index + 1}. ")
            menu.printMenuDetails(qty)
        }

        val formattedGrandTotal = String.format("%,.0f", grandTotal).replace(',', '.')
        println("GRAND TOTAL: Rp $formattedGrandTotal")
        println("=========================================")
    }
}