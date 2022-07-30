package chapter12.duck

class DuckCall : Quackable {
    private val observable = Observable(this)

    override fun quack() {
        println("꽉꽉")
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }

    override fun toString(): String {
        return "오리 호출기"
    }

}
