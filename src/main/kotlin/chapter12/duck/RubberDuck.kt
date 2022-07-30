package chapter12.duck

class RubberDuck : Quackable {
    private val observable = Observable(this)

    override fun quack() {
        println("삑삑")
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }

    override fun toString(): String {
        return "고무 오리"
    }
}
