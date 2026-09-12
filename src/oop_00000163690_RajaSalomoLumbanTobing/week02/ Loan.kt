package oop_00000163690_RajaSalomoLumbanTobing_week02

import java.util.Scanner

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1 // default 1 hari
) {

    // Method untuk hitung denda
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }

    fun printInfo() {
        println("Judul Buku: $bookTitle")
        println("Peminjam: $borrower")
        println("Durasi Pinjam: $loanDuration hari")
        println("Total Denda: Rp ${calculateFine()}")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- SISTEM DENDA PERPUSTAKAAN ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Durasi Pinjam (hari, default 1): ")
    val durationInput = scanner.nextLine()

    // Kalau user kosongkan input → default 1
    var loanDuration = if (durationInput.isBlank()) 1 else durationInput.toInt()

    // Validasi: durasi tidak boleh minus
    if (loanDuration < 0) {
        println("WARNING: Lama pinjam tidak boleh minus. Diset ke 1 hari.")
        loanDuration = 1
    }

    // Buat objek Loan
    val loan = Loan(bookTitle, borrower, loanDuration)

    println("Status: Data Peminjaman Tercatat.")
    loan.printInfo()
}