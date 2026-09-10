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

    // Kalau user kosongkan input, pakai default 1
    val loanDuration = if (durationInput.isBlank()) 1 else durationInput.toInt()

    // Buat objek Loan
    val loan = Loan(bookTitle, borrower, loanDuration)

    println("Status: Data Peminjaman Tercatat.")
    loan.printInfo()
}