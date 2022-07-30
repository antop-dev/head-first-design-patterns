package chapter11.duck

import chapter12.duck.*
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class DuckSimulator {

    @Test
    fun main() {
        val duckFactory = CountingDuckFactory()
        simulate(duckFactory)
    }

    private fun simulate(duckFactory: AbstractDuckFactory) {
        val flockOfMallards = Flock().apply {
            add(duckFactory.createMallardDuck())
            add(duckFactory.createMallardDuck())
            add(duckFactory.createMallardDuck())
            add(duckFactory.createMallardDuck())
        }

        val flockOfDucks = Flock().apply {
            add(duckFactory.createRedheadDuck())
            add(duckFactory.createDuckCall())
            add(duckFactory.createRubberDuck())
            add(GooseAdapter(Goose()))
            add(flockOfMallards)
        }

        println("\n오리 시뮬레이션 게임 (+옵저버)")

        val quackologist = Quackologist()
        flockOfDucks.registerObserver(quackologist)

        simulate(flockOfDucks)

        println("오리가 소리 낸 횟수: ${QuackCounter.numberOfQuacks}번")
        assertThat(QuackCounter.numberOfQuacks, `is`(11))
    }

    private fun simulate(duck: Quackable) {
        duck.quack()
    }

}
