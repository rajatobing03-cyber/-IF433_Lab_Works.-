package oop_00000163690_RajaSalomoLumbanTobing_week02

class Student( new*
    val name: String,
    val nim: String,
    var major: String
) {
    // Body class kosong dulu
}
class Student(val name: String, val nim: String, var major: String) {

    init { new*
        // Validasi sederhana: cek panjang NIM
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }
}