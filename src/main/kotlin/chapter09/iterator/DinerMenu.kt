package chapter09.iterator

open class DinerMenu : Menu {
    companion object {
        const val MAX_ITEMS = 6
    }

    private var numberOfItems = 0
    private val menuItems = Array<MenuItem?>(MAX_ITEMS) { null }

    init {
        addItem("채식주의자용 BLT", "통밀 위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99)
        addItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99)
        addItem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", false, 3.29)
        addItem("핫도그", "샤워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05)
        addItem("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice", true, 3.99)
        addItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89)
    }

    fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        if (numberOfItems >= MAX_ITEMS) {
            println("죄송합니다, 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.")
            return
        }
        val menuItem = MenuItem(name, description, vegetarian, price)
        menuItems[numberOfItems++] = menuItem
    }

    override fun createIterator(): Iterator<MenuItem> {
        // return AlternatingDinerMenuIterator(menuItems)
        return DinerMenuIterator(menuItems)
    }

}
