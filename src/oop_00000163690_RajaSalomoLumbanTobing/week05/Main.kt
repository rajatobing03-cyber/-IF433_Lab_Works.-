package oop_00000163690_RajaSalomoLumbanTobing.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")

    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi Sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }

        println("-------------------------")
    }


    val mathHelper = MathHelper()

    println("=== MATH HELPER ===")

    val luasPersegi = mathHelper.hitungLuas(5)
    println("Luas persegi dengan sisi 5 = $luasPersegi")

    val luasPersegiPanjang = mathHelper.hitungLuas(10, 5)
    println("Luas persegi panjang 10 x 5 = $luasPersegiPanjang")

    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas lingkaran dengan jari-jari 7 = $luasLingkaran")
}