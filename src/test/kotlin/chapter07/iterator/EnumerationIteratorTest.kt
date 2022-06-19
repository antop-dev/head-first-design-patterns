package chapter07.iterator

import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import java.util.*

class EnumerationIteratorTest {

    @Test
    fun next() {
        val st = StringTokenizer("1,2,3,4,5", ",")
        val iterator = EnumerationIterator(st)
        while (iterator.hasNext()) {
            println(iterator.next())
        }
    }

    @Test
    fun remove() {
        val st = StringTokenizer("1,2,3,4,5", ",")
        val iterator = EnumerationIterator(st)

        assertThrows(UnsupportedOperationException::class.java) {
            iterator.remove()
        }
    }

}
