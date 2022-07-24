package chapter11.remoteproxy

/**
 * 알맹이 매진
 */
class SoldOutState(@Transient val gumballMachine: GumballMachine) : State {
    override fun insertQuarter() {
        println("죄송합니다. 매진되었습니다.")
    }

    override fun ejectQuarter() {
        println("동전을 반환할 수 없습니다. 동전을 넣지 않았습니다.")
    }

    override fun turnCrank() {
        println("죄송합니다. 매진되엇습니다.")
    }

    override fun dispense() {
        println("알맹이를 내보낼 수 없습니다.")
    }

    override fun refill() {
        gumballMachine.state = gumballMachine.noQuarterState
    }

    override fun toString(): String {
        return "매진"
    }
}
