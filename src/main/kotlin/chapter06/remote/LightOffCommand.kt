package chapter06.remote

class LightOffCommand(private val light: Light) : Command {
    override fun execute() {
        light.off()
    }
}
