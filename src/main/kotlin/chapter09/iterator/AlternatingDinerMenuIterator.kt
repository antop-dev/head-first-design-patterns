package chapter09.iterator

import java.util.*

class AlternatingDinerMenuIterator(private val items: Array<MenuItem?>) : Iterator<MenuItem> {
    private var position = Calendar.DAY_OF_WEEK % 2

    override fun hasNext(): Boolean {
        return !(position >= items.size || items[position] == null)
    }

    override fun next(): MenuItem {
        val menu = items[position]!!
        position += 2
        return menu
    }
}
