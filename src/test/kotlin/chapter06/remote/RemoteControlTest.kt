package chapter06.remote

import org.junit.jupiter.api.Test

class RemoteControlTest {

    @Test
    fun main() {
        val remoteControl = RemoteControl()
        // 장치를 각자의 위치에 맞게 생성
        val livingRoomLight = Light("거실")
        val kitchenLight = Light("주방")
        val ceilingFan = CeilingFan("거실")
        val stereo = Stereo("거실")
        // 조명용 커맨드 객체 (람다로 대체)
//        val livingRoomLightOn = LightOnCommand(livingRoomLight)
//        val livingRoomLightOff = LightOffCommand(livingRoomLight)
//        val kitchenLightOn = LightOnCommand(kitchenLight)
//        val kitchenLightOff = LightOffCommand(kitchenLight)
        // 선풍기를 켜고 끄는 커맨드 객체
        val ceilingFanOn = CeilingFanOnCommand(ceilingFan)
        val ceilingFanOff = CeilingFanOffCommand(ceilingFan)
        // 오디오를 켜고 끄는 커맨드 객체
        val stereoOnWithCd = StereoOnWithCDCommand(stereo)
        val stereoOff = StereoOffCommand(stereo)
        // 리모컨 슬롯에 커맨드를 로드
        remoteControl.setCommand(0, { livingRoomLight.on() }, { livingRoomLight.off() })
        remoteControl.setCommand(1, { kitchenLight.on() }, { kitchenLight.off() })
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff)
        remoteControl.setCommand(3, stereoOnWithCd, stereoOff)
        // 리모컨 슬롯의 정보를 출력
        println(remoteControl)
        // 슬롯을 켰다가 끔
        remoteControl.onButtonWasPushed(0)
        remoteControl.offButtonWasPushed(0)
        remoteControl.onButtonWasPushed(1)
        remoteControl.offButtonWasPushed(1)
        remoteControl.onButtonWasPushed(2)
        remoteControl.offButtonWasPushed(2)
        remoteControl.onButtonWasPushed(3)
        remoteControl.offButtonWasPushed(3)
    }
}
