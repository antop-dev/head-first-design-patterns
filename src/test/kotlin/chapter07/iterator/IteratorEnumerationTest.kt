package chapter07.iterator

import org.junit.jupiter.api.Test

class IteratorEnumerationTest {

    @Test
    fun nextElement() {
        val list = listOf("a", "b", "c", "d")
        val enumeration = IteratorEnumeration(list.iterator())
        while (enumeration.hasMoreElements()) {
            println(enumeration.nextElement())
        }
    }

}
