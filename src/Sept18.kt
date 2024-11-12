import kotlin.math.sqrt
fun main() {
    var vec1 = Vector3D(0,0,1)
    var vec2 = Vector3D(0,4,0)
    var solution = vec1.crossProduct(vec2)
    println("${solution.x} ${solution.y} ${solution.z}")
    // vec1.distanceToOrigin = 5000000.0 <- with private and private set this will throw an error
    println(vec1.distanceToOrigin) // with private this will throw an error
}

class Vector3D(
    var x: Int, // x1
    var y: Int, // x2
    var z: Int // x3
) {
    /**private var (name) = <- use this to make it private outside of the class (like the main())
     * private set <- use this to make it public, but unable to altered outside of the class
     * implementation below
    **/
    var distanceToOrigin = sqrt((x*x + y*y + z*z).toDouble()) // you can set another property inside of the class instead of inside the parameter of the class
        private set

    /**
    val distanceToOrigin = sqrt((x*x + y*y + z*z).toDouble()) <- MUST BE VAL INSTEAD OF VAR
        get() = sqrt((x*x + y*y + z*z).toDouble()) <- use get() as a custom getter, gets the distanceToOrigin value for lines 7 and 9
        get() = sqrt((x*x + y*y + z*z).toDouble()).roundToInt()) <- to round to int, must import
    */

//    fun getDistanceToOrigin(): Double {
//        return this.distanceToOrigin
//    }

    fun crossProduct(other: Vector3D): Vector3D { // Takes a Vector3D (parameter) and returns a Vector3D (below)
        return Vector3D(
            // [a1, a2, a3]  x  [b1, b2, b3] =
            // [a2b3 - a3b2,    <- X coord
            // a3b1 - a1b3,     <- Y coord
            // a1b2 - a2b1]     <- Z coord
            this.y * other.z - this.z * other.y, // a2b3-a3b2
            this.z * other.x - this.x * other.z, // a3b1-a1b3
            this.x * other.y - this.y * other.x // a1b2-a2b1
        )
          /** this. refers to the x/y/z inside the CLASS it can never be used outside of the class to refer to a property from inside the class (ex: you cant put this.x in main() to get the x from Vector3D class
          // this. never refers to a function parameter, only the property
          // other. refers to the x/y/z in the "other" that is being called in crossProduct() as a parameter
          // By default, with Kotlin we can modify and access properties from outside of the class
          **/
    }

}

/** private vs public variables (properties) - visibility  modifier
 * By Default, Kotlin variables are set to public
 * If we want properties to be unable to be viewed outside of the class, set the property/variable to private
 */
/*
fun isValidEmail(email: String): Boolean {
    return email.contains("@")
}

fun getValidEmail(): String {
    print("Please enter email: ")
    var email = readln()
    while (!isValidEmail(email)) { // WHILE LOOPS WILL CONTINUE A LOOP UNTIL A CONDITION IS MET (IN THIS CASE !ISVALIDEMAIL = FALSE)
        print("Please enter email: ")
        email = readln()
    }


    var email = ""
    do { // DO WHILE LOOPS DO SOMETHING FIRST
        print("Please enter email: ")
        email = readln()
        while (!isValidEmail(email)) { // WHILE LOOPS WILL CONTINUE A LOOP UNTIL A CONDITION IS MET (IN THIS CASE !ISVALIDEMAIL = FALSE)
            print("Please enter email: ")
            email = readln()
        }
    }
    return email
}
*/