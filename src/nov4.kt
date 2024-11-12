//import kotlin.random.Random
//
//fun main() {
//
//}
//
//fun <T> evilToString(list: List<T>): String {
//    return list.filter { Random.nextInt(2) != 0 }.joinToString()
//}
//
//interface AList2D<T> {
//    /**
//     * Replaces item at coordinates [x], [y], with the [item]
//     */
//    fun set(x: Int, y: Int, item: T)
//    /**
//     * @return the item at coordinats [x], [y]
//     */
//    fun get(x: Int, y: Int): T
//    /**
//     * Adds a row [row] to the list2d
//     */
//    fun addRow(row: List<T> = listOf())
//}
//
//class NestedList2D<T>: AList2D<T> {
//    val items: List<MutableList<T>> = mutableListOf()
//
//    fun any(pred: (T) -> Boolean): Boolean {
//        return items.any{it.any(pred)}
//    }
//
//    override fun set(x: Int, y: Int, item: T) {
//        items[x][y] = item
//    }
//
//    override fun get(x: Int, y: Int): T {
//        return items[x][y]
//    }
//
//    override fun addRow(row: List<T>) {
//        items.add(row.map{it}.toMutableList())
//    }
//}
//
///**
// * @return a string representing only positive items in [list]
// */
//fun <T : Number> positiveToString(list: List<T>): String { // <- how to limit T to numbers
//    return list.filter { it.toDouble() > 0.0 }.toString()
//}
//
