package chapter12.mvc

class BeatController(private val model: BeatModelInterface) : ControllerInterface {
    private val view: DjView = DjView(this, model)

    init {
        view.createView()
        view.disableStopMenuItem()
        view.enableStartMenuItem()
        model.initialize()
    }

    override fun start() {
        model.on()
        view.disableStartMenuItem()
        view.enableStopMenuItem()
    }

    override fun stop() {
        model.off()
        view.enableStartMenuItem()
        view.disableStopMenuItem()
    }

    override fun increaseBpm() {
        model.bpm += 5
    }

    override fun decreaseBpm() {
        model.bpm -= 5
    }

    override fun setBpm(bpm: Int) {
        model.bpm = bpm
    }
}
