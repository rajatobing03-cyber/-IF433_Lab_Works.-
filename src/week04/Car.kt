package oop_00000163690_RajaSalomoLumbanTobing.week04

open class Car(brand: String, val numberOfDoors: int) : Vehicle(brand){

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka. ")
    }
}