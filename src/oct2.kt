/**
 * Maps and Sets
 *
 */

/**
 * Represents a Gambler
 * @property name is their name
 * @property winnings is their winnings - null if they haven't gambled yet (it's different if they have played and never won)
 */
data class Gambler(
    val name: String,
    val winnings: Int?
)


/**
 * @return the sum of the winnings from all gamblers in [gamblers]
 */
fun sumWinnings(gamblers: List<Gambler>): Int {
    var sum = 0;
    for (gambler in gamblers) {
//        if (gambler.winnings != null) {
//            sum += gambler.winnings
//        }
           sum += gambler.winnings ?: 0 // Elvis Operator
//          sum = (gambler.winnings)?.plus(sum) ?: sum
    }
    return sum
}

//data class StaffRecord(val id: Int, val name: String? ,val email: String)
//
//val records = listOf(
//    StaffRecord(id = 50, name = "Alvara", email = "alvaro@neu.edu"),
//    StaffRecord(id = 30, name = null, email = "beth@neu.edu"),
//    StaffRecord(id = 20, name = "Ben", email = "ben@neu.edu")
//)

/**
 * @return the email address record corresponding to the given ID
 */
//fun getAddressRecord(id: Int, records: List<StaffRecord>): String {
//    var record: StaffRecord? = null
//
//    for (possibleRecord in records) {
//        if (possibleRecord.id == id) {
//            record = possibleRecord
//        }
//    }
//    val output: StringBuilder = StringBuilder()
//    if (records.name != null) {
//        output.append(record.name)
//    } else {
//        output.append(record.email)
//    }
//
//    output.append(" <")
//    output.append(record.email)
//    output.append(">")
//    return output.toString()
//
//}


/**
 * Sets are VERY similar to lists.
 * Usually, the order of set elements has no significance.
 * Whereas in lists, the order of the list elements is important.
 */

/**
 *
 */
fun countPrefix(setOfStrings: Set<String>, prefix: String): Int {
    var count = 0

    for (word in setOfStrings) {
        if (word.startsWith(prefix)) {
            count++
        }
    }
    return count
}


/**
 * @return the number of distinct characters in [s]
 */
fun numUnique(s: String): Int {
    return s.toSet().size
}


/**
 * MAPS --
 * A way of translating an input to an output
 * Map keys are unique; the map holds only one value for each key.
 * Map keys can be of ANY type. In other collections, the index must be an Int. Whereas in Maps it can be of any type.
 *
 * Dictionaries -> Associative Arrays -> Maps
 * All different names for Maps
 */

val nicknames = mapOf(
    "Alexander" to "Alex",
    "Susan" to "Sue"
)

/**
 * @return a nickname od [name] if one exists,
 * returns "pal" if no nickname can be found
 */
fun findNickname(name: String): String {
//    return nicknames.getOrDefault(name, "pal")
    return nicknames[name] ?: "pal"
}


fun main() {
//    numUnique("Neel")
//    println(findNickname("Alexander")) // alex
//    println(findNickname("Susan")) // sue
//    println(findNickname("Louise")) // pal


}


