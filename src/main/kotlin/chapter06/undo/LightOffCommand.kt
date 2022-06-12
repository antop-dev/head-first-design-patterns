package chapter06.undo

class LightOffCommand(private val light: Light) : Command {
    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}
