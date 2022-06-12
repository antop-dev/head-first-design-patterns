package chapter06.party

class RemoteControl {
    private val noCommand = NoCommand()
    private val onCommands: Array<Command> = Array(7) { noCommand }
    private val offCommands: Array<Command> = Array(7) { noCommand }
    private var undoCommand: Command = noCommand

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    /**
     * 마지막으로 했던 작업 취소
     */
    fun undoButtonWasPushed() = undoCommand.undo()

    override fun toString(): String {
        var s = "\n------ 리모컨 ------\n";
        for (i in onCommands.indices) {
            s += "[slot %d] %-25s %-25s\n".format(i, onCommands[i]::class.simpleName, offCommands[i]::class.simpleName)
        }
        s += "[undo] ${undoCommand::class.simpleName}\n"
        return s
    }

}
