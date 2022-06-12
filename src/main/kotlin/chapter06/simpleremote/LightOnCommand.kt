package chapter06.simpleremote

/**
 * 조명을 키는 커맨트 클래스
 *
 * @param light 리시버 객체
 */
class LightOnCommand(private val light: Light) : Command {
    override fun execute() {
        light.on()
    }
}
