fun main() {
//    println(countWords("cat cat dog cat"))
//    println(getAddressRecord(id=30))
}

/**
 "Hello this is Rasika" - Input String

 Output Map -
 {"Hello" -> 1
"this" -> 1
 "is" -> 2
 "Rasika" -> 1}
 **/

/**
 * @return a map holding the counts of the words in [sentence]
 */
//fun countWords(sentence: String): Map<String, Int> {
//    val words = sentence.split(" ")
//    val counts = mutableMapOf<String, Int>()
//
//    for (word in words) {
//        counts[word] = counts.getOrDefault(word, 0) + 1
////        counts[word] = (counts[word] ?: 0) + 1
//    }
//    return counts
//}
//



//data class StaffRecord(val id: Int, val name: String?, val email: String)
//
//val records = mapOf(
//    50 to StaffRecord(id = 50, name = "Alvara", email = "alvaro@neu.edu"),
//    30 to StaffRecord(id = 30, name = null, email = "beth@neu.edu"),
//    20 to StaffRecord(id = 20, name = "Ben", email = "ben@neu.edu")
//)
//
//fun getAddressRecord(id: Int, notFoundString: String = "ID not found"): String { // notFoundString is specified by user, but defaults to "id not found" just incase they dont input anything
//    val correctRecord = records[id] // records.get(id) does the same thing but this is a shortcut
//    if (correctRecord == null) {
//        return notFoundString
//    } else {
//        val address = StringBuilder()
//        if (correctRecord.name == null) {
//            address.append(correctRecord.email)
//        } else {
//            address.append(correctRecord.name)
//        }
//
//        address.append(" <$correctRecord.email>")
//        return address.toString()
//    }
//}

enum class Bread {
    WHITE, BREAD, BAGEL
}

enum class Protein(val isVegetarian: Boolean) {
    TOFU(true), FALAFEL(true), TURKEY(false)
}

enum class Sauce {
    KETCHUP, MUSTARD, MAYO
}

data class Sandwich(
    val bread: Bread,
    val protein: Protein,
    val sauces: List<Sauce>,
    val toasted: Boolean
) {
    val isVegetarian
        get() = protein.isVegetarian
    fun make() {
        println("Place two slices of $bread")
        println("Place protein $protein on one of the slices")

        if (toasted) {
            println("Place it in the toaster")
        }

        for (sauce in sauces) {
            println("Add $sauce")
        }
    }
}