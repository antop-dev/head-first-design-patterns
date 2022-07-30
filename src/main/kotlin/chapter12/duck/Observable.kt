package chapter12.duck

class Observable(private val duck: QuackObservable) : QuackObservable {
    private val observers = mutableListOf<Observer>()

    override fun registerObserver(observer: Observer) {
        observers += observer
    }

    override fun notifyObservers() {
        observers.forEach { observer -> observer.update(duck) }
    }
}
