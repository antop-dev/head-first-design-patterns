package chapter06.remote

class GarageDoorOpenCommand(private val garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.up()
    }
}
