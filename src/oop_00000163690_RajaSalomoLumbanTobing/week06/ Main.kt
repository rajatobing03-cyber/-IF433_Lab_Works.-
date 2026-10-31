package oop_00000163690_RajaSalomoLumbanTobing.week06

// ==========================================
// INTERFACE
// ==========================================

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    fun turnOn()
    fun turnOff()
}

interface Recordable {
    fun startRecord()

    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud.")
    }
}


// ==========================================
// SMART LAMP
// ==========================================

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


// ==========================================
// SMART SPEAKER
// ==========================================

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


// ==========================================
// SMART CCTV
// ==========================================

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


// ==========================================
// SMART HOME HUB
// ==========================================

class SmartHomeHub {

    val devices = mutableListOf<SmartDevice>()

    // Menambahkan perangkat ke dalam hub
    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    // Mematikan semua perangkat yang Switchable
    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    // Mengaktifkan mode keamanan
    fun activateSecurityMode() {
        for (device in devices) {

            // Jika perangkat bisa merekam
            if (device is Recordable) {
                device.startRecord()
            }

            // Jika perangkat adalah SmartSpeaker
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}


// ==========================================
// MAIN PROGRAM
// ==========================================

fun main() {

    // Membuat Smart Home Hub
    val hub = SmartHomeHub()

    // Instansiasi perangkat
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

    // Menambahkan semua perangkat ke Smart Home Hub
    hub.addDevice(lampu)
    hub.addDevice(speaker)
    hub.addDevice(cctv)


    // ======================================
    // MENJALANKAN PERANGKAT
    // ======================================

    println("=== MENYALAKAN PERANGKAT ===")

    lampu.turnOn()
    speaker.turnOn()
    cctv.turnOn()


    // ======================================
    // MEMUTAR MUSIK
    // ======================================

    println()
    println("=== MEMUTAR MUSIK ===")

    speaker.playMusic("Lagu Favorit")


    // ======================================
    // SECURITY MODE
    // ======================================

    println()
    println("=== SECURITY MODE ===")

    hub.activateSecurityMode()


    // ======================================
    // MEMATIKAN SEMUA SWITCH
    // ======================================

    println()
    println("=== MEMATIKAN SEMUA PERANGKAT ===")

    hub.turnOffAllSwitches()


    // ======================================
    // STOP RECORDING CCTV
    // ======================================

    println()
    println("=== STOP RECORDING ===")

    cctv.stopRecord()
}