package chapter10.gumballstate

/**
 * 동전 없음
 */
class NoQuarterState(private val gumballMachine: GumballMachine) : State {
    override fun insertQuarter() {
        println("동전을 넣으셨습니다.")
        gumballMachine.state = gumballMachine.hasQuarterState
    }

    override fun ejectQuarter() {
        // 동전을 넣지 않고 돌려달라고 하면 안된다.
        println("동전을 넣어 주세요.")
    }

    override fun turnCrank() {
        // 동전을 넣지 않고 돌릴 수 없다.
        println("동전을 넣어 주세요.")
    }

    override fun dispense() {
        // 돈이 들어오기 전에는 알맹이를 내줄 수 없다.
        println("동전을 넣어주세요.")
    }

    override fun refill() {
        // do nothing
    }

    override fun toString(): String {
        return "동전 투입 대기중"
    }
}
