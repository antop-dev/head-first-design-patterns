package chapter07.duck

import org.junit.jupiter.api.Test

class TurkeyAdapterTest {
    @Test
    fun test() {
        val duck = MallardDuck()

        val turkey = WildTurkey()
        val turkeyAdapter = TurkeyAdapter(turkey)

        println("칠면조가 말하길")
        turkey.gobble()
        turkey.fly()

        println()
        println("오리가 말하길")
        testDuck(duck)

        println()
        println("칠면조 어댑터가 말하길")
        testDuck(turkeyAdapter)
    }

    private fun testDuck(duck: Duck) {
        duck.quack()
        duck.fly()
    }
}
