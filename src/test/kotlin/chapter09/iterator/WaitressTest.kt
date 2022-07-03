package chapter09.iterator

import org.junit.jupiter.api.Test

internal class WaitressTest {

    @Test
    fun printMenu() {
        val pancakeHouseMenu = PancakeHouseMenu()
        val dinerMenu = DinerMenu()
        val cafeMenu = CafeMenu()
        val waitress = Waitress(pancakeHouseMenu, dinerMenu, cafeMenu)
        waitress.printMenu()
    }

}
