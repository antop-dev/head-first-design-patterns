package chapter12.mvc

interface HeartModelInterface {
    val heartRate: Int
    fun registerObserver(o: BeatObserver)
    fun removeObserver(o: BeatObserver)
    fun registerObserver(o: BpmObserver)
    fun removeObserver(o: BpmObserver)
}
