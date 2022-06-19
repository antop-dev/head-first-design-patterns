package chapter07.iterator

import java.util.*

/**
 * Iterable 어댑터도 괜찮은거 같은데?
 */
class IterableEnumeration<T>(iterable: Iterable<T>) : Enumeration<T> {
    val iterator = iterable.iterator()
    override fun hasMoreElements() = iterator.hasNext()
    override fun nextElement(): T = iterator.next()
}
