package chapter06.party

class MacroCommand(val commands: Array<Command>) : Command {
    override fun execute() {
        for (command in commands) {
            command.execute()
        }
    }

    override fun undo() {
        for (command in commands.reversed()) {
            command.undo()
        }
    }
}
