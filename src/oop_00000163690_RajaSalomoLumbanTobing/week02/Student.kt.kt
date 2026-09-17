package oop_00000163690_RajaSalomoLumbanTobing_week02

class Student(
    val name: String,
    val nim: String,
    var major: String
) {

    // Secondary Constructor
    constructor(name: String, nim: String) : this(
        name,
        nim,
        "Belum ditentukan"
    )

    init {
        // Validasi sederhana: Cek panjang NIM
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM $nim yang tidak valid")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }

    fun printInfo() {
        println("=== DATA MAHASISWA ===")
        println("Nama   : $name")
        println("NIM    : $nim")
        println("Jurusan: $major")
    }
}