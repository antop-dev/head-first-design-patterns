package chapter11.remoteproxy

/**
 * 동전 있음
 */
class HasQuarterState(@Transient private val gumballMachine: GumballMachine) : State {

    override fun insertQuarter() {
        println("동전은 한개만 넣어주세요.")
    }

    override fun ejectQuarter() {
        println("동전이 반환됩니다.")
        gumballMachine.state = gumballMachine.noQuarterState
    }

    override fun turnCrank() {
        println("손잡이를 돌리셨습니다.")
        gumballMachine.state = gumballMachine.soldState
    }

    override fun dispense() {
        println("알맹이를 내보낼 수 없습니다.")
    }

    override fun refill() {
        // do nothing
    }

    override fun toString(): String {
        return "waiting for turn of crank"
    }
}
