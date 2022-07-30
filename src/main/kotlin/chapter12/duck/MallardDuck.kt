package chapter12.duck

class MallardDuck : Quackable {
    private val observable = Observable(this)

    override fun quack() {
        println("꽥꽥")
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }

    override fun toString(): String {
        return "청중오리"
    }
}
