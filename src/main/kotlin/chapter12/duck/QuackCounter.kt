package chapter12.duck

class QuackCounter(private val duck: Quackable) : Quackable {
    companion object {
        var numberOfQuacks: Int = 0
            private set
    }

    override fun quack() {
        duck.quack()
        numberOfQuacks++
    }

    override fun registerObserver(observer: Observer) {
        duck.registerObserver(observer)
    }

    override fun notifyObservers() {
        duck.notifyObservers()
    }

}
