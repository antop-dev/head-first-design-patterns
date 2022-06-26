package chapter08

import org.junit.jupiter.api.Test

class CaffeineBeverageTest {

    @Test
    fun prepareRecipe() {
        val coffee = Coffee()
        coffee.prepareRecipe()

        val tea = Tea()
        tea.prepareRecipe()
    }

}
