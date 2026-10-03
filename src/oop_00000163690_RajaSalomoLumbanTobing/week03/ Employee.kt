package oop_001_RajaSalomoLumbanTobing.week03

class Employee(val name: String){
    var salary: int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            // PERINGATAN: KODE DI BAWAH INI SALAH & BERBAHAYA!
            // KITA memanggil setter di dalam setter (Recursive)
            this.salary = value
        }
}
var salary: Int = 0
    set(value) {
        if (value < 0) {
            prinln("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
            field = 0 // Gunakan field untuk assign nilai asli
        }
    }