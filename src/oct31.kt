fun main() {
    val matrix = List2D()
}

/**
 * @return true if anything in this List2D fits [pred]
 */
class List2D {
    val items: MutableList<MutableList<Int>> = mutableListOf()

    fun any(pred: (Int) -> Boolean): Boolean {
        return items.any{ it.any(pred) }
    }

    /**
     * @return true if all items in this List2D fit [pred]
     */
    fun all(pred: (Int) -> Boolean): Boolean {
        return !any{ !pred(it) }
    }
}