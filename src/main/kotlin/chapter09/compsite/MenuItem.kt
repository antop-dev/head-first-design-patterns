package chapter09.compsite

/**
 * 잎 (Leaf)
 */
class MenuItem(
    override val name: String,
    override val description: String,
    override val isVegetarian: Boolean,
    override val price: Double
) : MenuComponent() {

    override fun print() {
        print("  $name")
        if (isVegetarian) print("(v)")
        println(", $price")
        println("     -- $description")
    }

}
