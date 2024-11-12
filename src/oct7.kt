fun main() {

}

val elephant = Person("Elephant", false)
val cat = Person("Cat", false)
val dog = Person("Dog", false)
val giraffe = Person("Giraffe", false)

val friends: Map<Person, Set<Person>> = mapOf(
    elephant to setOf(dog, giraffe),
    dog to setOf(elephant),
    giraffe to setOf(cat, elephant),
    cat to setOf(giraffe)
)

class Person(var name: String, var hasLadder: Boolean)

/**
 * @return which of [person]'s friends, or friends of friends, has a ladder.
 * @return null if no friends of friends
 */
fun findLadder(
    person: Person,
    friends: Map<Person, Set<Person>>): Person? {
    val level1Friends = friends[person]

    if (level1Friends == null) {
        return null
    } else {
        val friendsOfFriends = mutableSetOf<Person>()
        for (friend: Person in level1Friends) {
            if (friend.hasLadder) {
                return friend
            }
            friendsOfFriends.addAll(friends[friend] ?: setOf())
        }

        for (friend: Person in friendsOfFriends) {
            if (friend.hasLadder) {
                return friend
            }
        }
        return null
    }
}


val recipes = mapOf(
    "cake" to mapOf("flour" to 3, "eggs" to 4, "sugar" to 3),
    "soup" to mapOf("spinach" to 4, "cream" to 3)
)

/**
 * @return the total cost for all the ingredient for making the particular [meal]
 * according to [recipes]
 * @return null if [meal] is not found in [recipes]
 */
fun totalCost(meal: String, recipes: Map<String, Map<String, Int>>): Int? {
    if (meal !in recipes) {
        return null // you can also return -1 if you don't want it able to return null
    } else {
        val ingredients = recipes.getOrDefault(meal, mapOf())
        var cost = 0
        for (ingredient in ingredients) {
            cost += ingredient.component2()
        }

        return cost
    }
}

/**
 * A variable that holds an object holds a reference to that object
 * Multiple variables can hold references to the same object (aliasing)
 * If object is changed in 1 place, it's changed everywhere
 **/

/**
 * Array's lengths cannot be changed
 * Contents can be changed
 *
 * Syntax
 * Array of 10 Zeroes: val arr = Array(10){ 0 }
 * Array of 10 Nulls: var arr2 = Array<String?> = arrayOfNulls(10)
 * Array of 3 Strings: val arr3 = arrayOf("a", "b", "c")
 *
 * Accessing an element: int num = arr[4]
 * Overwrite an element: arr[4] = 5
 * arr.size <- Gets the length of an array
 */


/**
 * @return index of the smallest item in [arr]
 * Assume that [arr] has atleast 1 element in it.
 */
fun indexOfSmallest(arr: Array<Int>): Int {
    var smallest = arr[0]
    var smallestIdx = 0
    for (i in arr.indices) {
        if (arr[i] < smallest) {
            smallest = arr[i]
            smallestIdx = i
        }
    }
    return smallestIdx
}

/**
 * @return [n]th largest number in [arr]
 * Assume that [n] < arr.size, n > 0
 */
fun nthLargest(arr: Array<Int>, n: Int): Int {
    val nLargest = Array(n){arr[0]}
    for (num in arr) {
        /* if num > nth largest item found so far
        if we found a number bigger than the minimum
        of nLargest, replace that minimum with num */
        if (num > nLargest.min()) {
            val indexOfSmallest = indexOfSmallest(nLargest)
            nLargest[indexOfSmallest] = num
        }
    }

    return nLargest.min()
}

/**
 * NESTED ARRAYS ---
 * val nestedArr = Array(4) { Array(3) { 0 } }
 * nestedArr[0] = arrayOf(1, 2)
 * nestedArr[1] = arrayOf(1, 2, 3, 4)
 */