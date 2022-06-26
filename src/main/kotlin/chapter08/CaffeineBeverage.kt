package chapter08

/**
 * 카페인 음료
 */
abstract class CaffeineBeverage {
    /*
     * 서브클래스가 이 메소드를 오버라이드 못하도록 final로 선언 (코틀린은 기본이 final)
     */
    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        addCondiments()
    }

    /*
     * Coffee와 Tea에서 이 두 메소드를 서로 다른 방식으로 처리하므로 추상 메소드로 선언해야 한다.
     * 이 두 메소드는 서브 클래스가 알아서 처리하게 둔다.
     */

    /**
     * 우려내기
     */
    protected abstract fun brew()

    /**
     * 첨가물 추가
     */
    protected abstract fun addCondiments()

    private fun boilWater() {
        println("물을 끓이는 중")
    }

    private fun pourInCup() {
        println("컵에 따르는 중")
    }
}
