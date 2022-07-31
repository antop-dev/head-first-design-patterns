package chapter12.mvc

interface ControllerInterface {
    fun start()
    fun stop()
    fun increaseBpm()
    fun decreaseBpm()
    fun setBpm(bpm: Int)
}
