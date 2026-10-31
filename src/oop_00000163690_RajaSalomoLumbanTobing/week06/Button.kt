package oop_00000163690_RajaSalomoLumbanTobing.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}