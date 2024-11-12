fun main() {
//    guessingGame(10)
//    getThreeNames()
//    isPrime(10)
}

fun isValidEmail(email: String) =
    email.contains("@")

/**
fun getValidEmail(): String {
var email = "" // Make a variable that has something that's definitely invalid so it'll begin the loop
while  (!isValidEmail(email)) { // Keeps doing the while loop until boolean (isValidEmail is false) returns false (isValidEmail is true)
print("Please enter an email address: ")
email = readln()
}
return email
}
 **/

/**
 * Do while loops always iterates once or more
 *  normal while loops iterate 0 or more times
 */

fun getValidEmail(): String {
    var email = ""
    do { // do will iterate once and then check to see if it has to do it again. Then it will continue like a normal while loop
        print("Please enter an email address: ")
        email = readln()
    } while (!isValidEmail(email))
    return email
}

fun guessingGame(answer: Int) {
    do {
        print("Guess a number (integer)")
        val guess = readln().toInt()
        if (guess < answer) {
            println("Too low")
        } else if (guess > answer) {
            println("Too high")
        }
    } while (guess != answer)

    println("Answer Correct")
}

/**
 * You can use for loops when you know how many times you want it to iterate
 */

/** This is what we used to do using a while loop
fun getThreeNames() {
var numNames = 0
while (numNames < 3) {
print("Enter a name: ")
val name = readln()
println("Hello, $name")
numNames++
}
}
 **/

// With a for loop we can do this
fun getThreeNames() {
    for (numNames in 1..3) {
        print("Enter name number $numNames: ")
        val name = readln()
        println("Hello, $name")
    }
}

/**
 * While: 0 or more times
 * Do While: 1 or more times
 * For: exact number of times
 */

fun isPrime(num: Int): Boolean {
    // Only factors are 1 and itself
    for (possibleFactor in 2..num-1) {
        if (num % possibleFactor == 0) { // mod tells us the remainder of num / possibleFactor
            return false // if any number between 2 and the number - 1 is a factor, it's not a factor.
        }
    }
    return true // no numbers in between 2 and the number - 1 were factors, therefore it's a prime number.
}

fun countdown(num: Int) {
    for (i in 1..num) {
        println(num - i)
    }
    println("Blastoff")
}

/**
 * String properties / Methods
 * " - String
 * ' - Character
 * val s = "Kotlin"
 *
 * println(s.length)
 * Returns 6
 *
 * println(s.indices) - indices are the specific index of a string.
 * Returns 0..5
 *
 * println(s[0])
 * returns K
 *
 * println(s[s.length -1])
 * Returns n
 *
 * println(s.lowercase())
 * returns kotlin
 *
 * println(s[0].lowercase())
 * returns k
 */