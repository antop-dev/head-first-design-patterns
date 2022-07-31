package chapter12.mvc

class HeartController(model: HeartModelInterface) : ControllerInterface {
    private val view: DjView = DjView(this, HeartAdapter(model))

    init {
        view.createView()
        view.disableStartMenuItem()
        view.disableStopMenuItem()
    }

    override fun start() {
        // do nothing
    }

    override fun stop() {
        // do nothing
    }

    override fun increaseBpm() {
        // do nothing
    }

    override fun decreaseBpm() {
        // do nothing
    }

    override fun setBpm(bpm: Int) {
        // do nothing
    }
}
