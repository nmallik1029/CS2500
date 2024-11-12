fun main() {
    println(addOne(40))
    println(addOne(null))
    println(addOne(0))
}

/**
 * @return one more than [num]. Treating null like 0
 */
//fun addOne(num: Int?): Int {
//    return if (num == null) {
//         1
//    } else {
//         num + 1
//    }
//}

fun addOne(num: Int?):Int {
    return 1 + (num ?: 0)
}

//data class Person(
//    var firstName: String,
//    var lastName: String?) {
//
//    override fun toString() : String {
//        return if (lastName == null) {
//             firstName
//        } else
//            "$firstName $lastName"
//    }
//}

/**
 * Elvis Operator -
 * var result = value1 ?: value2
 * if value1 is not null, result is assigned its value
 * if value1 is null result is assigned value2's value
 */