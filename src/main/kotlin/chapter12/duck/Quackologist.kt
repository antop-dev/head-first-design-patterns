package chapter12.duck

class Quackologist : Observer {
    override fun update(duck: QuackObservable) {
        println("꽥꽥학자: ${duck}가 방금 소리냈다.")
    }
}
