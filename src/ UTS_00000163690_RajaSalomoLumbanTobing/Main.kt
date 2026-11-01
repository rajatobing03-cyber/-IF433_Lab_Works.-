package UTS_00000163690_RajaSalomoLumbanTobing

import java.util.Scanner

fun main() {
    println("=== UMN CATERING MANAGER SYSTEM ===")

    println("[Database Setup] Adding Nasi Goreng Spesial...")
    val menu1 = FoodMenu("Nasi Goreng Spesial", "nsg01", -15000.0)
    menu1.basePrice = 25000.0
    println("[Database Setup] Price updated to Rp 25.000")

    val menu2 = FoodMenu("Ayam Bakar Madu", "aym02", 35000.0)
    val menu3 = DrinkMenu("Es Teh Lemon", "lem01", 8000.0, true)

    val menuCatalog: List<CateringMenu> = listOf(menu1, menu2, menu3)

    val scanner = Scanner(System.`in`)
    println("\n--- CUSTOMER DATA INPUT ---")
    print("Enter Customer Name: ")
    val custName = scanner.nextLine()

    print("Enter Phone Number: ")
    val custPhone = scanner.nextLine()

    print("Enter Delivery Address: ")
    val custAddress = scanner.nextLine()

    val customer = Customer(custName, custPhone, custAddress)
    val order = CateringOrder(customer)


    while (true) {
        println("\nMENU CATALOG")
        for ((index, m) in menuCatalog.withIndex()) {
            println("${index + 1}.${m.name}")
        }
        println("0. [FINISH & CHECKOUT]")

        print("Select Menu Number: ")
        val choice = scanner.nextInt()

        if (choice == 0) {
            println("Processing Checkout...")
            break
        }

        if (choice > 0 && choice <= menuCatalog.size) {
            val selectedMenu = menuCatalog[choice - 1]
            print("Enter Quantity: ")
            val qty = scanner.nextInt()
            order.addMenuToOrder(selectedMenu, qty)
        } else {
            println("[Error] Invalid menu number, please try again.")
        }
    }


    order.status = OrderStatus.COOKING
    println()
    order.printInvoice()
}
