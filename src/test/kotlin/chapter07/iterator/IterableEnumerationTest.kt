package chapter07.iterator

import org.junit.jupiter.api.Test

class IterableEnumerationTest {

    @Test
    fun nextElement() {
        val list = listOf("a", "b", "c", "d")
        val enumeration = IterableEnumeration(list)
        while (enumeration.hasMoreElements()) {
            println(enumeration.nextElement())
        }
    }

}
