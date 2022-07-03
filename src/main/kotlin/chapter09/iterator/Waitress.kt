package chapter09.iterator

class Waitress(private val pancakeHouseMenu: Menu, private val dinerMenu: Menu, val cafeMenu: Menu) {
    /**
     * 메뉴에 있는 모든 항목을 출력
     */
    fun printMenu() {
        val pancakeIterator = pancakeHouseMenu.createIterator()
        val dinerIterator = dinerMenu.createIterator()
        val cafeIterator = cafeMenu.createIterator()
        println("MENU\n----\n아침 메뉴")
        printMenu(pancakeIterator)
        println("\n점심 메뉴")
        printMenu(dinerIterator)
        println("\n저녁 메뉴")
        printMenu(cafeIterator)
    }

    private fun printMenu(iterator: Iterator<MenuItem>) {
        while (iterator.hasNext()) {
            val item = iterator.next()
            println("${item.name}, ${item.price} -- ${item.description}")
        }
    }

}
