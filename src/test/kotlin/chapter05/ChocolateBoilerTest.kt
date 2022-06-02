package chapter05

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class ChocolateBoilerTest {

    @Test
    fun singleton() {
        val boiler1 = ChocolateBoiler.getInstance()
        assertThat(boiler1.empty, `is`(true))
        assertThat(boiler1.boiled, `is`(false))

        boiler1.fill()
        assertThat(boiler1.empty, `is`(false))
        assertThat(boiler1.boiled, `is`(false))

        boiler1.boil()
        assertThat(boiler1.empty, `is`(false))
        assertThat(boiler1.boiled, `is`(true))

        boiler1.drain()
        assertThat(boiler1.empty, `is`(true))

        val boiler2 = ChocolateBoiler.getInstance()
        assertThat(boiler2.empty, `is`(true))
        assertThat(boiler2.boiled, `is`(true))
        assertThat(boiler1.empty, `is`(boiler2.empty))
        assertThat(boiler1.boiled, `is`(boiler2.boiled))
    }

    @Test
    fun enum() {
        val boiler1 = EnumChocolateBoiler.INSTANCE
        assertThat(boiler1.empty, `is`(true))
        assertThat(boiler1.boiled, `is`(false))

        boiler1.fill()
        assertThat(boiler1.empty, `is`(false))
        assertThat(boiler1.boiled, `is`(false))

        boiler1.boil()
        assertThat(boiler1.empty, `is`(false))
        assertThat(boiler1.boiled, `is`(true))

        boiler1.drain()
        assertThat(boiler1.empty, `is`(true))

        val boiler2 = EnumChocolateBoiler.INSTANCE
        assertThat(boiler2.empty, `is`(true))
        assertThat(boiler2.boiled, `is`(true))
        assertThat(boiler1.empty, `is`(boiler2.empty))
        assertThat(boiler1.boiled, `is`(boiler2.boiled))
    }

}
