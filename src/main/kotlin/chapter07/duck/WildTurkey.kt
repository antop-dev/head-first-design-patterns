package chapter07.duck

/**
 * 야생 칠면조
 */
class WildTurkey : Turkey {
    override fun gobble() {
        println("골골")
    }

    override fun fly() {
        println("짧은 거리를 날고 있어요!")
    }
}
