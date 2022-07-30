package chapter12.duck

class Flock : Quackable {
    private val quackers = mutableListOf<Quackable>()

    fun add(quacker: Quackable) {
        quackers += quacker
    }

    override fun quack() {
        quackers.forEach { quacker -> quacker.quack() }
    }

    override fun registerObserver(observer: Observer) {
        quackers.forEach { quacker -> quacker.registerObserver(observer) }
    }

    override fun notifyObservers() {
        quackers.forEach { quacker -> quacker.notifyObservers() }
    }

    override fun toString(): String {
        return "오리 무리"
    }

}
