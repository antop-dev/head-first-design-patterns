package chapter06.simpleremote

class SimpleRemoteControl(var slot: Command? = null) {
    fun buttonWasPressed() {
        slot?.execute()
    }
}
