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
        println("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine() // Bersihkan newline

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()
            // Primary Constructor
            val s1 = Student(name, nim, major)
            println("Status: Pendaftaran Selesai.")
            s1.printInfo()
        } else if (type == 2) {
            // Secondary Constructor
            val s2 = Student(name, nim)
            println("Status: Pendaftaran Selesai.")
            s2.printInfo()
        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }
}
