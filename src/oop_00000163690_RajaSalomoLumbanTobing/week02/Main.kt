package oop_00000163690_RajaSalomoLumbanTobing_week02

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    // Input nama
    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    // Input NIM
    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine() // Bersihkan newline

    // Validasi panjang NIM
    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        return
    }

    // Pilih jalur
    println("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine() // Bersihkan newline

    when (type) {
        1 -> {
            // Jalur Reguler
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()

            // Primary Constructor
            val student = Student(name, nim, major)

            println("Status: Pendaftaran Selesai.")
            student.printInfo()
        }

        2 -> {
            // Jalur Umum
            // Secondary Constructor
            val student = Student(name, nim)

            println("Status: Pendaftaran Selesai.")
            student.printInfo()
        }

        else -> {
            println("Pilihan tidak valid, pendaftaran dibatalkan!")
        }
    }
}