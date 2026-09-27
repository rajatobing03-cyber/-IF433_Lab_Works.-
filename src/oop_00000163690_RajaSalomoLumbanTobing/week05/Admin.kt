package oop_00000163690_RajaSalomoLumbanTobing.week05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang dudul di depan komputer melayani administrasi. ")
    }
    fun doAdmin() {
        println("[$nama] sedang merekap data absensi mahasiswa")
    }
}