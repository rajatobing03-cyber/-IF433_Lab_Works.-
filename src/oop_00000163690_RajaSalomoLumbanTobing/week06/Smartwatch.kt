package oop_00000163690_RajaSalomoLumbanTobing.week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {

    override fun showTime(){
        println("Layar OLED menyala: 14.00 WIB")
    }

    override fun connetcToBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }
}