package chapter06.undo

import org.junit.jupiter.api.Test

class RemoteControlWithUndoTest {

    @Test
    fun light() {
        val remoteControl = RemoteControlWithUndo()

        val livingRoomLight = Light("거실")
        val livingRoomLightOn = LightOnCommand(livingRoomLight)
        val livingRoomLightOff = LightOffCommand(livingRoomLight)

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)

        remoteControl.onButtonWasPushed(0)
        remoteControl.offButtonWasPushed(0)
        println(remoteControl)
        remoteControl.undoButtonWasPushed()
        remoteControl.offButtonWasPushed(0)
        remoteControl.onButtonWasPushed(0)
        println(remoteControl)
        remoteControl.undoButtonWasPushed()
    }

    @Test
    fun ceilingFan() {
        val remoteControl = RemoteControlWithUndo()

        val ceilingFan = CeilingFan("거실")
        val ceilingFanMedium = CeilingFanMediumCommand(ceilingFan)
        val ceilingFanHigh = CeilingFanHighCommand(ceilingFan)
        val ceilingFanOff = CeilingFanOffCommand(ceilingFan)

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff)
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff)

        remoteControl.onButtonWasPushed(0)
        remoteControl.offButtonWasPushed(0)
        println(remoteControl)
        remoteControl.undoButtonWasPushed()

        remoteControl.onButtonWasPushed(1)
        println(remoteControl)
        remoteControl.undoButtonWasPushed()
    }
}
