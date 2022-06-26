package chapter08

import java.util.*

class CoffeeWithHook : CaffeineBeverageWithHook() {
    override fun brew() {
        println("필터로 커피를 우려내는 중")
    }

    override fun addCondiments() {
        println("설탕과 우유를 추가하는 중")
    }

    override fun customerWantsCondiments(): Boolean {
        val answer = getUserInput()
        return answer.lowercase(Locale.getDefault()) == "y"
    }

    private fun getUserInput(): String {
        println("커피에 우유와 설탕을 넣을까요? (y/n)")
        return readln()
    }
}

fun main() {
    val coffee = CoffeeWithHook()
    coffee.prepareRecipe()
}
