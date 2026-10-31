package oop_00000163690_RajaSalomoLumbanTobing.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name sedang dinyalakan.")
    }

    override fun turnOff() {
        println("$name sedang dimatikan.")
    }
}