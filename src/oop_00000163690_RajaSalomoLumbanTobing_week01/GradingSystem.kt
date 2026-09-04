package oop_00000163690_RajaSalomoLumbanTobing_week01

fun main() {
    var name: String = "Raja Salomo"
    var score: int = 80

    println("Nama: " +name + ", Nilai: " + score)

}

fun main() {
    val name = "Raja Salomo"
    val score = 80

    println("nama: $name, Nilai: $score")
}

val grade = when (score){
    in 90..100 -> "A"
    in 80 .. 100 -> "B"
    in 70..79 -> "C"
    else -> "D"
}

  println("Grade Kamu: $grade")

