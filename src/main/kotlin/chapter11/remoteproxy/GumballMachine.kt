package chapter11.remoteproxy

import java.rmi.registry.LocateRegistry
import java.rmi.registry.Registry
import java.rmi.server.UnicastRemoteObject
import kotlin.random.Random

class GumballMachine(override val location: String, count: Int) : UnicastRemoteObject(), GumballMachineRemote {
    val soldOutState: State
    val noQuarterState: State
    val hasQuarterState: State
    val soldState: State

    override var count = 0
    override lateinit var state: State

    init {
        soldOutState = SoldOutState(this)
        noQuarterState = NoQuarterState(this)
        hasQuarterState = HasQuarterState(this)
        soldState = SoldState(this)

        this.count = count
        state = if (count > 0) noQuarterState else soldState
    }

    /**
     * 동전을 투입한다.
     */
    fun insertQuarter() = state.insertQuarter()

    /**
     * 동전을 반환 받는다.
     */
    fun ejectQuarter() = state.ejectQuarter()

    /**
     * 손잡이를 돌린다.
     */
    fun turnCrank() {
        state.turnCrank()
        state.dispense()
    }

    fun releaseBall() {
        println("알맹이를 내보내고 있습니다.")
        if (count > 0) count--
    }

    /**
     * 알맹이를 채운다.
     */
    fun refill(numGumBalls: Int) {
        count = numGumBalls
        println("The gumball machine was just refilled; its new count is: $count")
        state.refill()
    }

}

fun main() {
    val registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT)
    val random = Random(System.currentTimeMillis())
    val locations = arrayOf("santafe", "boulder", "austin")

    locations.forEach { location ->
        val machine = GumballMachine(location, random.nextInt(10, 200))
        registry.rebind(location, machine)
        println("register ${machine.location}, count = ${machine.count}")
    }
}
