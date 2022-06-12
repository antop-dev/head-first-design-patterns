package chapter06.party

class StereoOnCommand(private val stereo: Stereo) : Command {
    override fun execute() {
        stereo.on()
    }

    override fun undo() {
        stereo.off()
    }
}
