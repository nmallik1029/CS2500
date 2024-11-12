/**
 * Higher Order Functions
 * A function that takes a function as an argument or returns a function
 */

fun main() {

}

fun anyInt(nums: List<Int>, pred: (Int) -> Boolean): Boolean {
    for (num in nums) {
        if (pred(num)) {
            return true
        }
    }
    return false
}

/**
 * @return true is all items in [list] contains either "(:" or ":)".
 * and false otherwise
 */

