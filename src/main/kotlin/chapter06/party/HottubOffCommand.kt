package chapter06.party

class HottubOffCommand(private val hottub: Hottub) : Command {
    override fun execute() {
        hottub.setTemperature(36)
        hottub.off()
    }

    override fun undo() {
        hottub.on()
    }
}
