package chapter12.mvc

import kotlin.concurrent.thread
import kotlin.random.Random

class HeartModel : HeartModelInterface {

    private val beatObservers = mutableListOf<BeatObserver>()
    private val bpmObservers = mutableListOf<BpmObserver>()
    var time = 1000

    private val random = Random(System.currentTimeMillis())

    init {
        thread {
            var lastRate = -1
            while (true) {
                var change = random.nextInt(10)
                if (random.nextInt(2) == 0) {
                    change = 0 - change
                }
                val rate = 60000 / (time + change)
                if (rate in 51..119) {
                    time += change
                    notifyBeatObservers()
                    if (rate != lastRate) {
                        lastRate = rate
                        notifyBpmObservers()
                    }
                }
                Thread.sleep(time.toLong())
            }
        }
    }

    override var heartRate: Int
        get() = 60_000 / time
        set(_) { /* do nothing */ }

    override fun registerObserver(o: BeatObserver) {
        beatObservers += o
    }

    override fun registerObserver(o: BpmObserver) {
        bpmObservers += o
    }

    override fun removeObserver(o: BeatObserver) {
        beatObservers += o
    }

    override fun removeObserver(o: BpmObserver) {
        bpmObservers -= o
    }

    private fun notifyBeatObservers() {
        beatObservers.forEach { it.updateBeat() }
    }

    private fun notifyBpmObservers() {
        bpmObservers.forEach { it.updateBpm() }
    }

}
