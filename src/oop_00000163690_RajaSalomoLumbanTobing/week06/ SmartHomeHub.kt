package oop_00000163690_RajaSalomoLumbanTobing.week06

class SmartHomeHub {

    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        for (device in devices) {

            // Jika device adalah Recordable, mulai merekam
            if (device is Recordable) {
                device.startRecord()
            }

            // Jika device adalah SmartSpeaker, putar suara peringatan
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}