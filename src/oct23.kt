fun main() {
    println(sumInt(1234))
}

fun sumInt(num: Int): Int =
    if (num == 0) {
        0 // BASE CASE
    } else {
        (num % 10) + sumInt(num / 10) // RECURSIVE
    }

