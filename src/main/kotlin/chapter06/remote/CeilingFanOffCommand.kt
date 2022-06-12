package chapter06.remote

class CeilingFanOffCommand(private val ceilingFan: CeilingFan) : Command {
    override fun execute() {
        ceilingFan.off()
    }
}
