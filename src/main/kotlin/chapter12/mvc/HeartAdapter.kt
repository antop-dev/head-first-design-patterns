package chapter12.mvc

class HeartAdapter(private val heart: HeartModelInterface) : BeatModelInterface {
    override var bpm: Int
        get() = heart.heartRate
        set(_) { /* do noting */ }

    override fun initialize() {
        // do nothing
    }

    override fun on() {
        // do nothing
    }

    override fun off() {
        // do nothing
    }

    override fun registerObserver(o: BeatObserver) {
        heart.registerObserver(o)
    }

    override fun registerObserver(o: BpmObserver) {
        heart.registerObserver(o)
    }

    override fun removeObserver(o: BeatObserver) {
        heart.removeObserver(o)
    }

    override fun removeObserver(o: BpmObserver) {
        heart.removeObserver(o)
    }

}
