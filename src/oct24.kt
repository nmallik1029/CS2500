//fun main() {
//    println(evenNums)
//    println(evenNums1)
//    println(a)
//    println(anyEndsWithE)
//}
//
//fun addOne(n: Int): Int = n + 1
//
//val operation: (Int) -> Int = ::addOne // or { addOne(it) } | Storing a function in a variable
//var result = operation(4) // USING A VARIABLE LIKE A FUNCTION
//
//// 'it' is an anonymous function.
//// You use this if you only need a function once, then you never need it again.
//
//// .filter() is a higher order function
//
//val nums = listOf(1, 2, 3, 4)
//val evenNums = nums.filter({it % 2 == 0}) // it % 2 == 0 is a BOOLEAN. If it's true the filter function returns the number
//
//fun isEven(x: Int): Boolean = x % 2 == 0
//val evenNums1 = nums.filter(::isEven) // same thing with anonymous functions
//
//val anyEven = nums.any({ it % 2 == 0 }) // anonymous function
//val anyEven1 = nums.any({ num -> num % 2 == 0}) // same thing but replacing it with num
//val anyEven2 = nums.any(::isEven) // does the same thing but not using an anonymous function, instead using the function that we already created
//
//val profs = listOf("Bhalerao", "Monge", "Rollins", "Spertus")
//
//val startsEndSame = profs.filter({ it[0]  == it[it.length-1] })
//val a = listOf(1, 2, 3).filter { it > 2 }
//
//val anyEndsWithE = profs.any({ it.endsWith("e")}) // you could replace "any" with "all" in the cases
//
//val allStartWithFirstHalf = profs.all({ it[0].uppercase() <= "M"})
//
//// A string is like a sequence / list. You can add strings together (join them), adding to the length, shortening it, etc., just like you can with lists.
//fun randomUpperLower(c: Char) =
//    if (Random.next(2) == 1) c.uppercase()
//    else c.lowercase()
//fun sarcasm(text: String) = text.map {
//    random
//}