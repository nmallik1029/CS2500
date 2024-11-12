fun main() {
//    println(reverse("Neel"))
    tryAll(4)
}

/**
 * @return the reverse of the [text]
 */
fun reverse(text: String): String {
    // base case: Simplest possible version
    if (text == "") {
        return ""
    } else { // recursive case
        // do 1 step
        val firstLetter = text[0]
        var everythingElse = text.substring(1) // EVERYTHING EXCEPT FOR 0 (starting letter) UNTIL THE END OF THE STRING
        // recursively call function
        everythingElse = reverse(everythingElse)
        return everythingElse + firstLetter
    }
}

/**
 * Prints [n] pieces of text provided by the user,
 * in reverse order. This can be done using a "for" loop but we will do this using
 * recursion.
 *
 * Assume [n] >= 0
 */
fun reverseInput(n: Int) {
    // base case
//    if (n == 0) {
//        // do nothing
//        return
    if (n > 0) {
        // recursive case
        // 1 step
        print("Enter some text")
        val text = readln()
        // recursively do everything else
        reverseInput(n-1)
        println(text) // We want to do it in REVERSE. So we need to recursively call it BEFORE we print anything.
    }
}

val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9') + ".,-?!".toList()
val PASSWORD = "Mini"

fun unlock(password: String) {
    if (password == PASSWORD) {
        println("Unlocked!")
    }
}

/**
 * Calls unlock() with all passwords of length [len]
 */
fun tryAll(len: Int, passwordGuess: String = "") {
    // base case
    if (passwordGuess.length == len) {
        unlock(passwordGuess)
    } else {
        // recursive case
        for (digit in chars) {
        // guess 1 digit
            val currentGuess = passwordGuess + digit
        // recursively guess remaining digits
            tryAll(len, currentGuess)
        }

    }
}