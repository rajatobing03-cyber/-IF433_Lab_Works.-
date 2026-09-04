package oop_001_johnthor.week01
fun main(args: Array<String>) {
// Variable definition
    var radius: Double = 7.0
    var pi: Double = 3.14
// Calculation
    var area: Double = pi * radius * radius

    // Output Concatenation
    println("Radius: " + radius + ", Area: " + area)

    // Logic check
    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")

        ```kotlin
        fun main(args: Array<String>) {
            // Variable definition
            val radius = 7.0
            val pi = 3.14

            // Calculation
            val area = pi * radius * radius

            // Output menggunakan String Template
            println("Radius: $radius, Area: $area")

            // Logic check
            checkSize(area)
        }

        fun checkSize(area: Double) {
            if (area > 100) {
                println("This is a Big Circle")
            } else {
                println("This is a Small Circle")
            }
        }
        ```
        fun main(args: Array<String>) {
            // Variable definition
            val radius = 7.0
            val pi = 3.14

            // Calculation
            val area = pi * radius * radius

            // Output
            println("Radius: $radius, Area: $area")

            // Logic check
            println(checkSize(area))
        }

        fun checkSize(area: Double) = if (area > 100) {
            "This is a Big Circle"
        } else {
            "This is a Small Circle"
        }