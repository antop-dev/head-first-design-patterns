package chapter12.duck

abstract class AbstractDuckFactory {
    abstract fun createMallardDuck(): Quackable
    abstract fun createRedheadDuck(): Quackable
    abstract fun createDuckCall(): Quackable
    abstract fun createRubberDuck(): Quackable
}
