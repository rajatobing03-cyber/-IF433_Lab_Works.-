package oop_00000163690_RajaSalomoLumbanTobing.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name sedang dinyalakan.")
    }

    override fun turnOff() {
        println("$name sedang dimatikan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}