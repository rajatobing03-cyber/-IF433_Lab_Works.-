package oop_00000163690_RajaSalomoLumbanTobing.week04

class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}