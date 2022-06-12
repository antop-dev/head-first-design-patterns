package chapter06.party

/**
 *  커맨드 인터페이스
 */
interface Command {
    fun execute()

    fun undo()
}
