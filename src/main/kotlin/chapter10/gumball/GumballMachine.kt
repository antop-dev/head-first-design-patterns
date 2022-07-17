package chapter10.gumball

class GumballMachine(count: Int) {
    companion object {
        /**
         * 알맹이 매진
         */
        const val SOLD_OUT = 0

        /**
         * 동전 없음
         */
        const val NO_QUARTER = 1

        /**
         * 동전 있음
         */
        const val HAS_QUARTER = 2

        /**
         * 알맹이 판매
         */
        const val SOLD = 3
    }

    var count = 0
    var state = SOLD_OUT

    init {
        this.count = count
        if (count > 0) {
            state = NO_QUARTER
        }
    }

    /**
     * 동전을 투입한다.
     */
    fun insertQuarter() {
        when (state) { // 조건문으로 상태를 확인한다.
            HAS_QUARTER -> println("동전은 한개만 넣어주세요.")
            NO_QUARTER -> {
                state = HAS_QUARTER
                println("동전을 넣으셨습니다.")
            }
            SOLD_OUT -> println("매진되었습니다. 다음 기회에 이용해주세요.")
            SOLD -> println("알맹이를 내보내고 있습니다.")
        }
    }

    /**
     * 동전을 반환 받는다.
     */
    fun ejectQuarter() {
        when (state) {
            HAS_QUARTER -> {
                println("동전이 반환됩니다.")
                state = NO_QUARTER
            }
            NO_QUARTER -> println("동전을 넣어 주세요.")
            SOLD -> println("이미 알맹이를 뽑으셨습니다.")
            SOLD_OUT -> println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.")
        }
    }

    /**
     * 손잡이를 돌린다.
     */
    fun turnCrank() {
        when (state) {
            SOLD -> println("손잡이는 한 번만 돌려주세요.")
            NO_QUARTER -> println("동전을 넣어 주세요.")
            SOLD_OUT -> println("매진되었습니다.")
            HAS_QUARTER -> {
                println("손잡이를 돌리셨습니다.")
                state = SOLD
                dispense()
            }
        }
    }

    /**
     * 알맹이를 내보낸다.
     */
    fun dispense() {
        when (state) {
            SOLD -> {
                println("알맹이를 내보내고 있습니다.")
                count--
                state = if (count == 0) {
                    println("더 이상 알맹이가 없습니다.")
                    SOLD_OUT
                } else {
                    NO_QUARTER
                }
            }
            NO_QUARTER -> println("동전을 넣어 주세요.")
            SOLD_OUT -> println("매진입니다.")
            HAS_QUARTER -> println("알맹이를 내보낼 수 없습니다.")
        }
    }

    /**
     * 알맹이를 채운다.
     */
    fun refill(numGumBalls: Int) {
        count = numGumBalls
        state = NO_QUARTER
    }

    override fun toString(): String {
        val result = StringBuffer()
        result.append("\n주식회사 왕뽑기")
        result.append("\n자바로 돌아가는 최신형 뽑기 기계\n")
        result.append("남은 개수: ${count}개\n")
        when (state) {
            SOLD_OUT -> result.append("매진")
            NO_QUARTER -> result.append("동전 투입 대기중")
            HAS_QUARTER -> result.append("waiting for turn of crank")
            SOLD -> result.append("delivering a gumball")
        }
        result.append("\n")
        return result.toString()
    }

}
