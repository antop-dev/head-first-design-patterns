package chapter05

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SingletonTest {

    @Test
    fun getInstance() {
        val i1 = Singleton.getInstance()
        println(i1.getDescription())

        val i2 = Singleton.getInstance()
        assertEquals(i1, i2)
    }

    @Test
    fun enumSingleton() {
        val i1 = EnumSingleton.INSTANCE
        print(i1.getDescription())

        var i2 = EnumSingleton.INSTANCE
        assertEquals(i1, i2)
    }

}
