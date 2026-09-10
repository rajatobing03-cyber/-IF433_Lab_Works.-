package oop_00000163690_RajaSalomoLumbanTobing_week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine() // Bersihkan buffer newline

    // Validasi panjang NIM
    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan (kosongkan jika belum memilih): ")
        val major = scanner.nextLine()

        // Instansiasi Objek Student
        val s1 = if (major.isBlank()) {
            Student(name, nim) // pakai secondary constructor
        } else {
            Student(name, nim, major) // pakai primary constructor
        }

        println("Status: Pendaftaran Selesai.")
        s1.printInfo()
    }
}
