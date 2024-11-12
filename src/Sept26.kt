import kotlin.random.Random

/**
 * In Kotlin, we can't modify the contents (and the length) of a normal (immutable) list
 * We need to use a Mutable list to modify the contents and length of the list.
 * For arrays, we can modify the contents but not the length.
 */

fun main() {

}

fun getRandomArray(size: Int,
                   minRandomNum: Int,
                   maxRandomNum: Int): Array<Int> {

    val nums = Array(size, ::getZero) // array of correct size, full of zeros
    for (idx in nums.indices) {
        nums[idx] = Random.nextInt(minRandomNum, maxRandomNum) // filling the array with random numbers
    }
    return nums
}

fun getZero(idx: Int): Int {
    return 0
}

/**
 * String Builder
 * .append - adds a string to the end of another string
 */

/**
 * Rewriting sarcasm function from last class with .append/string builder
 */
fun sarcasm(word: String): String {
    val sarcasticWord = StringBuilder()
    for (char in word) {
        if (Random.nextInt(2) == 0) {
            sarcasticWord.append(char.uppercase())
        } else {
            sarcasticWord.append(char.lowercase())
        }
    }
    return sarcasticWord.toString()
}

fun weirdEmphasis(sentence: String): String {
    val emphasizesSentence = StringBuilder()
    for (word in sentence.split(" ")) {
        if (Random.nextInt(2) == 0) {
            emphasizesSentence.append(word.uppercase())
        } else {
            emphasizesSentence.append(word.lowercase())
        }
    }

return emphasizesSentence.toString().substring(1)
}