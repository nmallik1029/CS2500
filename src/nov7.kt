fun main() {
    println(isSorted(listOf(1,2,3,4,5)))
    println(isSorted(listOf(1,3,5,4,2)))

}

fun <E : Comparable<E>> isSorted(items: List<E>): Boolean {
    return items.indices.all{it == items.size - 1 || items[it] <= items[it + 1]}
}

class Point2D(val x: Double, val y: Double) : Comparable<Point2D> {

    fun distToOrigin(): Double {
        return Math.sqrt(x * x + y * y)
    }

    override fun compareTo(other: Point2D): Int = // IMPLEMENT MEMBERS
//        distToOrigin().compareTo(other.distToOrigin())
        when {
            this.distToOrigin() > other.distToOrigin() -> 1
            this.distToOrigin() < other.distToOrigin() -> -1
            else -> 0
        }
}

class Plant : Comparable<Plant> {
    var sunlightHours = 0

    fun giveSunlight(hours : Int) {
        sunlightHours += hours
    }
    override fun compareTo(other: Plant): Int =
        when {
            sunlightHours > other.sunlightHours -> 1
            sunlightHours < other.sunlightHours -> -1
            else -> 0
    }
}