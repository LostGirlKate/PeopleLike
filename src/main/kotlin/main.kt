fun main() {
    val likes = 1021
    val peopleStr = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
    println("Понравилось $likes $peopleStr")
}