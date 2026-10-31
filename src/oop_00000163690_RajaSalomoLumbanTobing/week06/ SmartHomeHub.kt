package oop_00000163690_RajaSalomoLumbanTobing.week06

fun main() {

    // Membuat SmartHomeHub
    val hub = SmartHomeHub()

    // Membuat perangkat
    val lampu = SmartLamp(
        "L001",
        "Ruang Tamu"
    )

    val speaker = SmartSpeaker(
        "SP001",
        "Google Nest Dapur"
    )

    val cctv = SmartCCTV(
        "CCTV001",
        "Ezviz Garasi"
    )

    // Menambahkan semua perangkat ke Hub
    hub.addDevice(lampu)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    // Mengaktifkan Security Mode
    println("=== SECURITY MODE ===")
    hub.activateSecurityMode()

    // Mematikan semua perangkat Switchable
    println()
    println("=== TURN OFF ALL SWITCHES ===")
    hub.turnOffAllSwitches()
}