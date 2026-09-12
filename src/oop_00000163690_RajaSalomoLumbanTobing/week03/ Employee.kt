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
