package chapter12.mvc

interface BeatModelInterface {
    var bpm: Int

    /**
     * BeatModel 인스턴스가 만들어질 때 호출되는 메소드
     */
    fun initialize()

    /**
     * 비트 생성기를 킨다.
     */
    fun on()

    /**
     * 비트 생성기를 끈다.
     */

    fun off()

    /**
     * 연락받을 옵저버 등록
     */
    fun registerObserver(o: BeatObserver)

    /**
     * 연락받을 옵저버 해제
     */
    fun removeObserver(o: BeatObserver)

    /**
     * BPM이 바뀌 때만 연락받을 옵저버 등록
     */
    fun registerObserver(o: BpmObserver)

    /**
     * BPM이 바뀌 때만 연락받을 옵저버 해제
     */
    fun removeObserver(o: BpmObserver)
}
