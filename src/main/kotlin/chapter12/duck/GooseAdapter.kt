package chapter12.duck

class GooseAdapter(private val goose: Goose) : Quackable {
    private val observable = Observable(this)

    override fun quack() {
        goose.honk()
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }

    override fun toString(): String {
        return "거위"
    }

}
