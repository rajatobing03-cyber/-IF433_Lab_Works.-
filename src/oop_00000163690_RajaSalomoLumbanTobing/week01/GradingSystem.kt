package oop_00000163690_RajaSalomoLumbanTobing_week01
fun main() {

    val name = "John Thor"
    val score = 80

    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")

    println("Status: ${calculateStatus(score)}")

    val studentId: String? = null
    val idLength = studentId?.length ?: 0
    println("Panjang ID: $idLength")
}


fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"