package chapter10.gumballstate

/**
 * 알맹이 판매
 */
open class SoldState(private val gumballMachine: GumballMachine) : State {
    override fun insertQuarter() {
        println("알맹이를 내보내고 있습니다.")
    }

    override fun ejectQuarter() {
        println("이미 알맹이를 뽑으셨습니다.")
    }

    override fun turnCrank() {
        println("손잡이는 한 번만 돌려 주세요.")
    }

    override fun dispense() {
        gumballMachine.releaseBall()
        if (gumballMachine.count > 0) {
            gumballMachine.state = gumballMachine.noQuarterState
        } else {
            println("Oops, out of gumballs")
            gumballMachine.state = gumballMachine.soldOutState
        }
    }

    override fun refill() {

    }

    override fun toString(): String {
        return "delivering a gumball"
    }
}
