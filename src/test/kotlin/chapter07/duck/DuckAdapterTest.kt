package chapter07.duck

import org.junit.jupiter.api.Test

internal class DuckAdapterTest {

    @Test
    fun test() {
        val turkey = WildTurkey()

        val duck = MallardDuck()
        val duckAdapter = DuckAdapter(duck)

        println("오리가 말하길")
        duck.quack()
        duck.fly()

        println()
        println("칠먼조가 말하길")
        testTurkey(turkey)

        println()
        println("오리 어댑터가 말하길")
        testTurkey(duckAdapter)

    }

    private fun testTurkey(turkey: Turkey) {
        turkey.gobble()
        repeat(10) {
            turkey.fly()
        }
    }
}
