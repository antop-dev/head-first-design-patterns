package chapter05

class Singleton private constructor() {

    companion object {
        private var instance: Singleton? = null

        @JvmStatic
        fun getInstance() = instance ?: Singleton().also { instance = it }
    }

    fun getDescription() = "I'm a Singleton!"

}
