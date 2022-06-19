package chapter07.iterator

import java.util.*

class IteratorEnumeration<T>(val iterator: Iterator<T>) : Enumeration<T> {
    override fun hasMoreElements() = iterator.hasNext()
    override fun nextElement(): T = iterator.next()
}
