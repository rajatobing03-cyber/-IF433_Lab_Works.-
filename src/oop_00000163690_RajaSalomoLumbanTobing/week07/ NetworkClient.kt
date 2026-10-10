package oop_00000163690_RajaSalomoLumbanTobing.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        printl("Connecting to $url...")
    }
}