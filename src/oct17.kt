/**
 * Inheritance and Abstract Classes
 */
fun main() {

}

open class Shirt(val size: Int) {
    val buttons = mutableListOf<Button>()

    open fun addButton(button: Button) { // IF YOU WANT TO OVERRIDE SOMETHING YOU NEEd TO MAKE THE FUNCTION "OPEN"
        buttons.add(button)
    }

    inner class Button(val fancy: Boolean) // when you make a class inside of another class, its good to put "inner" when defining the class
}

class FormalShirt(size: Int) : Shirt(size) {
    var tie: Tie? = null // begins as null, user can change it

    inner class Tie

    override fun addButton(button: Button) { // IF YOU WANT TO OVERRIDE SOMETHING YOU NEEd TO MAKE THE FUNCTION "OPEN"
        if (button.fancy) {
//            buttons.add(button)
            super.addButton(button)
            /**
             * "super" means call the version in the superclass. if we change the way the button is added, we dont need to change them
             *  individually throughout the classes, we can just change it through the superclass (open class Shirt), instead of through each subclass (class FormalShirt).
             */
        }
    }
}