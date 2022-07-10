package chapter09.compsite

class Menu(
    override val name: String,
    override val description: String
) : MenuComponent() {
    private val menuComponents = mutableListOf<MenuComponent>()

    override fun add(menuComponent: MenuComponent) {
        menuComponents += menuComponent
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponents -= menuComponent
    }

    override fun getChild(i: Int): MenuComponent {
        return menuComponents[i]
    }

    override fun print() {
        print("\n$name")
        println(", $description")
        println("----------------------")
        menuComponents.forEach { it.print() }
    }

}
