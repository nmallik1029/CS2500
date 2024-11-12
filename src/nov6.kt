//fun main() {
//
//}
//
//interface DataStructure<E> {
//    /**
//     * Adds [item] to the data structure
//     */
//    fun add(item: E)
//    /**
//     * Remove [item] to the data structure
//     * @return true if it was successful, false if the item was not found
//     */
//    fun remove(item: E): Boolean
//    /**
//     * @return the number of elements in this data structure
//     */
//    fun size(): Int
//}
//
//class Blob<T> : DataStructure<T> {
//    val items: MutableMap<T, Int> = mutableMapOf()
//    override fun add(item: T) {
//        items[item] = items.getOrDefault(item, 0) + 1
//    }
//
//    override fun remove(item: T): Boolean {
//        val count = items[item] // null if item is not there
//        if (count == null) {
//            return false
//        } else {
//            if (count == 1) {
//                items.remove(item)
//            } else {
//                items[item] = count - 1
//            }
//            return true
//        }
//
//    }
//
//    override fun size(): Int {
//        return items.values.sum()
//    }
//}
//
//class SortedList<S : Comparable<S> : DataStructure<S> {
//    val items = mutableListOf<S>()
//
//    override fun add(item: S) {
//        val index = items.indexOfFirst{it > item}
//
//        if (index == -1) {
//            items.add(item)
//        } else {
//            items.add(index, item)
//        }
//    }
//
//    override fun remove(item: S): Boolean {
//        TODO("Not yet implemented")
//    }
//
//    override fun size(): Int {
//        TODO("Not yet implemented")
//    }
//}
