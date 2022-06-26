package chapter08

/**
 * 카페인 음료
 */
abstract class CaffeineBeverageWithHook {

    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        if (customerWantsCondiments()) {
            addCondiments()
        }
    }

    protected abstract fun brew()

    protected abstract fun addCondiments()

    private fun boilWater() {
        println("물을 끓이는 중")
    }

    private fun pourInCup() {
        println("컵에 따르는 중")
    }

    // 이 메소드는 서브클래스에서 필요할 때 오버라이드할 수 있는 메소드이므로 후크다.
    open fun customerWantsCondiments() = true
}
