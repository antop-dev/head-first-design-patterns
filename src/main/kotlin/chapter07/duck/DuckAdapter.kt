package chapter07.duck

class DuckAdapter(val duck: Duck) : Turkey {
    var count = 0

    override fun gobble() {
        duck.quack()
    }

    override fun fly() {
        count = (count + 1) % 5
        if (count == 0) duck.fly()
    }
}
