package chapter06.undo

class CeilingFanOffCommand(private val ceilingFan: CeilingFan) : Command {
    private var prevSpeed = ceilingFan.speed

    override fun execute() {
        prevSpeed = ceilingFan.speed
        ceilingFan.off()
    }

    override fun undo() {
        when (prevSpeed) {
            CeilingFan.HIGH -> ceilingFan.high()
            CeilingFan.MEDIUM -> ceilingFan.medium()
            CeilingFan.LOW -> ceilingFan.low()
            CeilingFan.OFF -> ceilingFan.off()
        }
    }

}
