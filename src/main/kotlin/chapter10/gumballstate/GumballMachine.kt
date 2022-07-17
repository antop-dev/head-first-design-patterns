package chapter10.gumballstate

class GumballMachine(count: Int) {
    val soldOutState: State
    val noQuarterState: State
    val hasQuarterState: State
    val soldState: State
    val winnerState: State

    var count = 0
        private set
    var state: State

    init {
        soldOutState = SoldOutState(this)
        noQuarterState = NoQuarterState(this)
        hasQuarterState = HasQuarterState(this)
        soldState = SoldState(this)
        winnerState = WinnerState(this)

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

    override fun toString(): String {
        val result = StringBuffer()
        result.append("\n주식회사 왕뽑기")
        result.append("\n자바로 돌아가는 최신형 뽑기 기계\n")
        result.append("남은 개수: ${count}개\n")
        result.append("상태: ${state}\n")
        return result.toString()
    }

}
