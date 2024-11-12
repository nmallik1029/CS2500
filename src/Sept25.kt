import java.util.*
import kotlin.math.roundToInt
import kotlin.random.Random

/**
 * Data Structures
 */

fun main() {
//   printCongratulation()
//   printEveryOtherLetter("Rasika")
//   getNames()
//   println(sarcasm("Professor Rasika"))
//   println(weirdEmphasis("Professor Rasika is here"))


/** Basic Arrays --
    val nums = arrayOf(1,2,3)
    nums[2] = 40
    println(Arrays.toString(nums))
 **/
}

fun printCongratulation() {
    for(i in 1..10) {
        println("Congratulations")
    }
}

fun validState() {
    do {
        print("Enter a valid US State")
        val state = readln()
    } while (!isValid(state))

}

fun isValid(state: String) = true // for further implementation

fun printEveryOtherLetter(word: String) {
    for (idx in 0..word.length - 1 step 2) { // intProgression
        println(word[idx])
    /** for (idx in 0..(word.length / 2.0).roundToInt() - 1) { <- intRange
        println(word[idx*2])
     **/
    }
}

fun getNames() {
    print("How many people\n")
    val numPeople = readln().toInt()
    /** CREATING A LIST -- Mutable meaning we can add/remove elements later **/
    val allNames = mutableListOf<String>() /** Empty list of strings that val name adds to every time the for loop iterates. Replace String with anything else (Int, Double, Boolean). Unless there's already something in the list **/
    for (person in 1..numPeople) {
        print("Name of person number $person: ")
        val name = readln()
        allNames.add(name)
    }
    println(allNames)
}

/** BUILDING A STRING **/
//fun sarcasm(word: String): String {
//    var sarcastic = ""
//    for (char in word) {
//        if (Random.nextInt(2) == 0) {
//            sarcastic += char.lowercase()
//        } else {
//            sarcastic += char.uppercase()
//        }
//    }
//    return sarcastic
//}

//fun weirdEmphasis(sentence: String): String {
//    val words = sentence.split(" ")
//    /** "Prof Rasika is here" <- sentence is split by spaces, so it'll be split into 4 strings
//    {"Prof, "Rasika", "is", "here"}
//    **/
//    val emphasizeWords = mutableListOf<String>()
//    for (word in words) {
//        if (Random.nextInt(2) == 0) {
//            emphasizeWords.add(word.uppercase())
//        } else {
//            emphasizeWords.add(word.lowercase())
//        }
//    }
//    return emphasizeWords.joinToString(" ")
//}