package chapter10.gumball

import org.junit.jupiter.api.Test

class GumballMachineTest {

    @Test
    fun main() {
        val gumballMachine = GumballMachine(5) // 처음에 알맹이를 5개 넣고 시작
        println(gumballMachine) // 기계의 상태를 출력

        gumballMachine.insertQuarter() // 동전을 넣음
        gumballMachine.turnCrank() // 손잡이를 돌림 -> 알맹이가 나옴
        println(gumballMachine)

        gumballMachine.insertQuarter() // 동전을 넣음
        gumballMachine.ejectQuarter() // 동전을 반환함
        gumballMachine.turnCrank() // 손잡이를 돌림 -> 알맹이가 안나옴
        println(gumballMachine)

        gumballMachine.insertQuarter() // 동전을 넣음
        gumballMachine.turnCrank() // 손잡이를 돌림 -> 알맹이가 나옴
        gumballMachine.insertQuarter() // 동전을 넣음
        gumballMachine.turnCrank() // 손잡이를 돌림 -> 알맹이가 나옴
        gumballMachine.ejectQuarter() // 동전을 반환함
        println(gumballMachine)

        gumballMachine.insertQuarter()
        gumballMachine.insertQuarter() // 동전을 두번 넣음
        // 내구성 검사
        gumballMachine.turnCrank()
        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()
        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()

        println(gumballMachine)
    }
}
