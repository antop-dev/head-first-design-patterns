package chapter07.hometheater

import org.junit.jupiter.api.Test

class HomeTheaterFacadeTest {

    @Test
    fun test() {
        val amp = Amplifier("앰프")
        val tuner = Tuner("AM/FM Tuner", amp)
        val player = StreamingPlayer("스트리밍 플레이어", amp)
        val cd = CdPlayer("CD Player", amp)
        val projector = Projector("프로젝터", player)
        val lights = TheaterLights("조명")
        val screen = Screen("스크린")
        val popper = PopcornPopper("팝콘 기계")

        val homeTheater = HomeTheaterFacade(amp, tuner, player, projector, lights, screen, popper)
        homeTheater.watchMovie("인디아나 존스: 레이더스")
        homeTheater.endMovie()
    }
}
