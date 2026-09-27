package oop_00000163690_RajaSalomoLumbanTobing.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("bekerja $nama")
    }

    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.git")
    }
}