package chapter06.party

import org.junit.jupiter.api.Test

class RemoteControlTest {

    @Test
    fun macro() {
        val remoteControl = RemoteControl()

        val light = Light("거실")
        val tv = TV("거실")
        val stereo = Stereo("거실")
        val hottub = Hottub()

        val lightOn = LightOnCommand(light)
        val stereoOn = StereoOnCommand(stereo)
        val tvOn = TVOnCommand(tv)
        val hottubOn = HottubOnCommand(hottub)

        val lightOff = LightOffCommand(light)
        val stereoOff = StereoOffCommand(stereo)
        val tvOff = TVOffCommand(tv)
        val hottubOff = HottubOffCommand(hottub)

        // ON 커맨드용 배열과 OFF 커맨드용 배열을 생성
        val partyOn = arrayOf(lightOn, stereoOn, tvOn, hottubOn)
        val partyOff = arrayOf(lightOff, stereoOff, tvOff, hottubOff)
        // 매크로 커맨드 생성
        val partyOnMacro = MacroCommand(partyOn)
        val partyOffMacro = MacroCommand(partyOff)

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro)

        println(remoteControl)
        println("--- 매크로 ON ---")
        remoteControl.onButtonWasPushed(0)
        remoteControl.undoButtonWasPushed()
        println()
        println("--- 매크로 OFF ---")
        remoteControl.offButtonWasPushed(0)
    }
}
