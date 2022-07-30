package chapter12.duck

class RedheadDuck : Quackable {
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
        return "붉은머리오리"
    }

}
