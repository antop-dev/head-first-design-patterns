package chapter10.gumballstate

interface State {
    /**
     * 동전을 투입한다.
     */
    fun insertQuarter()

    /**
     * 동전을 반환 받는다.
     */
    fun ejectQuarter()

    /**
     * 손잡이를 돌린다.
     */
    fun turnCrank()

    /**
     * 알맹이를 내보낸다.
     */
    fun dispense()

    /**
     * 알맹이를 다시 채운다.
     */
    fun refill()
}
