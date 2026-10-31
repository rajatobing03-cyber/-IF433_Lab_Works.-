package oop_00000163690_RajaSalomoLumbanTobing.week0

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("$name sedang dinyalakan.")
        startRecord()
    }

    override fun turnOff() {
        println("$name sedang dimatikan.")
    }

    override fun startRecord() {
        println("$name mulai merekam.")
    }
}