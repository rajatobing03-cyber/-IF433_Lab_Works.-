package oop_00000163690_RajaSalomoLumbanTobing.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }

    val tax: Double
        get() = salary * 0.1

    fun increasePerformance() {
        println("Performa $name meningkat!")
    }
}