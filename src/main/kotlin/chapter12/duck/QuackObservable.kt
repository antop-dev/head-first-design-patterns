package chapter12.duck

interface QuackObservable {
    fun registerObserver(observer: Observer)
    fun notifyObservers()
}
