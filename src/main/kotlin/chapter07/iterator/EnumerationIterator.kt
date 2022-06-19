package chapter07.iterator

import java.util.*

class EnumerationIterator<T>(private val enumeration: Enumeration<T>) : MutableIterator<T> {
    override fun hasNext() = enumeration.hasMoreElements()
    override fun next(): T = enumeration.nextElement()
    override fun remove() {
        throw UnsupportedOperationException("remove")
    }
}
