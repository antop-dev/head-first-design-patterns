package chapter10.gumballstate

import org.junit.jupiter.api.Test

class GumballMachineTest {

    @Test
    fun main() {
        val gumballMachine = GumballMachine(10) // 처음에 알맹이를 5개 넣고 시작
        println(gumballMachine) // 기계의 상태를 출력

        repeat(10) {
            gumballMachine.insertQuarter() // 동전을 넣음
            gumballMachine.turnCrank() // 손잡이를 돌림 -> 알맹이가 나옴
        }
        println(gumballMachine)

        gumballMachine.refill(50)
        print(gumballMachine)
    }
}
