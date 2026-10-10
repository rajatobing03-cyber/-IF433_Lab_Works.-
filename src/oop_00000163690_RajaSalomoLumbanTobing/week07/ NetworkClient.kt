package oop_00000163690_RajaSalomoLumbanTobing.week07

class NetworkClient private constructor(val url: String) {

    companion object {
        const val BASE_URL = "https://api.umn.ac.id"

        fun createClient() : NetworkClient {
            println("Membangun NetworkClient dengan BASE_URL: $BASE_URL")
            retrun NetworkClient(BASE_URL)
        }
    }

    fun connect() {
        printl("Connecting to $url...")
    }
}