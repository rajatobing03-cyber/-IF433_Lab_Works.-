package oop_001_Johntor.week02

class Student( new*
    val name: String,
    val mim: String,
    var major: String
){
        //Body class kosong dulu
}
class Student ( val name: String, val nim: String, val major: String){
    init { // new*
        //Validasi Sederhana: cek panjang NIM
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM (%nim) yang tidak valid!")
            println("Data mahasiswa $name munghkin akan bermasalah di sistem.")
        }else{
            println("LOG: Objek Student $name berhasil dialokasikan di memory!")
        }
    }
}
