package chapter07.hometheater

class HomeTheaterFacade(
    private val amp: Amplifier,
    private val tuner: Tuner, // 사용하지 않는데?
    private val player: StreamingPlayer,
    private val projector: Projector,
    private val lights: TheaterLights,
    private val screen: Screen,
    private val popper: PopcornPopper
) {
    fun watchMovie(movie: String) {
        println("영화 볼 준비 중")
        popper.on()
        popper.pop()
        lights.dim(10)
        screen.down()
        projector.on()
        projector.wideScreenMode()
        amp.on()
        amp.setStreamingPlayer(player)
        amp.setSurroundSound()
        amp.setVolume(5)
        player.on()
        player.play(movie)
    }

    fun endMovie() {
        println("홈시어터를 끄는 중")
        popper.off()
        lights.on()
        screen.up()
        projector.off()
        amp.off()
        player.stop()
        player.off()
    }

}
