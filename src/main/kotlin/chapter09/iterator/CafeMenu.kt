package chapter09.iterator

class CafeMenu : Menu {
    private val menuItems = mutableMapOf<String, MenuItem>()

    init {
        addItem("베지 버거와 에어 프라이", "통밀빵, 상추, 토마토, 감자 튀김이 첨가된 베지 버거", true, 3.99)
        addItem("오늘의 스프", "셀러드가 곁들여진 오늘의 스프", false, 3.69)
        addItem("부리토", "통 핀토콩과 살사, 구아카몰이 곁들여진 푸짐한 부리토", true, 4.29)
    }

    fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        val menuItem = MenuItem(name, description, vegetarian, price)
        menuItems[name] = menuItem
    }

    override fun createIterator(): Iterator<MenuItem> {
        return menuItems.values.iterator()
    }

}
