package chapter09.compsite

class Waitress(private val allMenus: MenuComponent) {

    fun printMenu() {
        allMenus.print()
    }

}
