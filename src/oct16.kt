/**
 * Subclasses and Inheritance
 */

/*
[1, 2, 3,
 4, 5, 6,
 7, 8, 9]
 +
[4, 2, 3,
 9, 7, 6,
 7, 8, 9]
 =
[5, 4, 6,
 13, 12, 12,
 14, 16, 18]

 When you add matrices, you add each element to each other and return each individually in a new matrix of the same size.
 */

/**
 * @return the elementwise sum of [mat1] and [mat2].
 * Assume [mat1] and [mat2] have the same dimensions
 */
fun sum(mat1: Array<Array<Double>>,
        mat2: Array<Array<Double>>): // Both parameters are 2d arrays (matrix)
        Array<Array<Double>> { // returns a 2d array (matrix)
    val toReturn = Array(mat1.size){ Array(mat1[0].size){0.0} } // have to do this for HW6
    for (row in mat1.indices) {
        for (col in mat1[0].indices) {
            toReturn[row][col] = mat1[row][col] + mat2[row][col]
        }
    }
    return toReturn
}

/**
 * Subclass - Sometimes called a child or base class is a more specific verion of a superclass
 * Superclass - Parent of base class
 *
 * Subclass EXTENDS the superclass
 *
 * Subclass is more specific, superclass is more GENERAL
 *
 * Member of the subclass can be used whenever the superclass is required
 *
 * SYNTAX ---------------------------------
 * open class <SuperclassName>
 * class <SubclassName> : <SuperclassName>()
 *
 * open class Cat
 * class Lion : Cat
 * In this example, Lion is a subclass of the superclass Cat
 */

open class Cat {
    open var clawSharpness : Int = 4 // we need to make this "open" so we can edit it in the Lion subclass
    open val threshold = 5

    fun knead() {
        println("Kneading")
    }

    fun scratchPost() {
        if (clawSharpness > threshold) {
            println("Scratching")
        } else {
            println("Not sharp enough")
        }
    }
}

class Lion : Cat() {
    override var clawSharpness: Int = 7 // if we want to change the clawSharpness if the animal is a lion we need override because we already declared it in the Cat superclass
    override val threshold = 10

    fun roar() {
        println("Roar")
    }
}

/**
 * ANYTHING IS A SUBTYPE OF ANY
 * ANY is any type, so if you want something to return any type, you'd use the "any" superclass.
 */
open class Rectangle(val length: Int, val width: Int) {
    val area: Int
        get() = length * width
}

class Square(side: Int) : Rectangle(side, side)  // the length and width of the rectangle is equal to the user defined side since it's a square


fun main() {
    val mini = Cat() // superclass
    mini.knead()
    val alex = Lion() // subclass
    alex.roar() // Specific to Lions (Subclass)
    alex.knead() // even though we didn't specifically say that lions can knead, lions are part of the Cat superclass, who can knead.
    mini.scratchPost()
    alex.scratchPost()

    val square1 = Square(5)
    println(square1.area)
    val rectangle1 = Rectangle(10,5)
    println(rectangle1.area)
}

