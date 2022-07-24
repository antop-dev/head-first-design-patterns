package chapter11.remoteproxy

import java.rmi.Naming

class GumballMonitor(private val machine: GumballMachineRemote) {

    fun report() {
        println("뽑기 기계 위치: ${machine.location}")
        println("현재 재고: ${machine.count}개")
        println("현재 상태: ${machine.state}")
    }

}

fun main() {
    val locations = arrayOf("santafe", "boulder", "austin")

    locations.map { location ->
        val machine = Naming.lookup("rmi://127.0.0.1/${location}") as GumballMachineRemote
        GumballMonitor(machine)
    }.forEach {
        println()
        it.report()
    }
}
