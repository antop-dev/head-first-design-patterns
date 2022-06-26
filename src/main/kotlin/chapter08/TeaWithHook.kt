package chapter08

import java.util.*

class TeaWithHook : CaffeineBeverageWithHook() {
    override fun brew() {
        println("찻잎을 우려내는 중")
    }

    override fun addCondiments() {
        println("레몬을 추가하는 중")
    }

    override fun customerWantsCondiments(): Boolean {
        val answer = getUserInput()
        return answer.lowercase(Locale.getDefault()) == "y"
    }

    private fun getUserInput(): String {
        println("차에 레몬을 넣을까요? (y/n)")
        return readln()
    }
}

fun main() {
    val tea = TeaWithHook()
    tea.prepareRecipe()
}
