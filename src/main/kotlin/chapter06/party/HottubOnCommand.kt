package chapter06.party

class HottubOnCommand(private val hottub: Hottub) : Command {
    override fun execute() {
        hottub.on()
        hottub.setTemperature(40)
        hottub.circulate()
    }

    override fun undo() {
        hottub.off()
    }
}
