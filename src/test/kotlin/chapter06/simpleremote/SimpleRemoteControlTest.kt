package chapter06.simpleremote

import org.junit.jupiter.api.Test

class SimpleRemoteControlTest {
    @Test
    fun main1() {
        val remote = SimpleRemoteControl()
        val light = Light()
        val lightOn = LightOnCommand(light)

        remote.slot = lightOn
        remote.buttonWasPressed()
    }

    @Test
    fun main2() {
        val remote = SimpleRemoteControl()
        // light
        val light = Light()
        val lightOn = LightOnCommand(light)
        // garage door
        val garageDoor = GarageDoor()
        val garageDoorOpen = GarageDoorOpenCommand(garageDoor)

        remote.slot = lightOn
        remote.buttonWasPressed()
        remote.slot = garageDoorOpen
        remote.buttonWasPressed()
    }
}
