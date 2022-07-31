package chapter12.mvc

import javax.sound.sampled.AudioSystem
import javax.sound.sampled.Clip
import javax.sound.sampled.Line


class BeatModel : BeatModelInterface, Runnable {
    override var bpm: Int = 90
        set(value) {
            field = value
            notifyBPMObservers()
        }

    private var beatObservers = mutableListOf<BeatObserver>()
    private var bpmObservers = mutableListOf<BpmObserver>()

    private var clip: Clip? = null
    private var thread: Thread? = null
    private var stop = false

    override fun initialize() {
        val url = ClassLoader.getSystemResource("clap.wav").toURI().toURL()
        clip = (AudioSystem.getLine(Line.Info(Clip::class.java)) as Clip).apply {
            open(AudioSystem.getAudioInputStream(url))
        }
    }

    override fun on() {
        stop = false
        thread = Thread(this).apply {
            start()
        }
    }

    override fun off() {
        stopBeat()
        stop = true
    }

    override fun run() {
        notifyBPMObservers()
        while (!stop) {
            playBeat()
            notifyBeatObservers()
            Thread.sleep((60_000 / bpm).toLong())
        }
    }

    private fun notifyBeatObservers() {
        beatObservers.forEach { it.updateBeat() }
    }

    private fun notifyBPMObservers() {
        bpmObservers.forEach { it.updateBpm() }
    }

    override fun registerObserver(o: BeatObserver) {
        beatObservers += o
    }

    override fun removeObserver(o: BeatObserver) {
        beatObservers -= o
    }

    override fun registerObserver(o: BpmObserver) {
        bpmObservers += o
    }

    override fun removeObserver(o: BpmObserver) {
        bpmObservers -= o
    }

    private fun playBeat() {
        clip?.run {
            framePosition = 0
            start()
        }
    }

    private fun stopBeat() {
        clip?.run {
            framePosition = 0
            stop()
        }
    }

}
