package chapter05

class DclSingleton private constructor() {

    companion object {
        @Volatile
        private var instance: DclSingleton? = null

        @JvmStatic
        fun getInstance() = instance ?: synchronized(this) {
            instance ?: DclSingleton().also {
                instance = it
            }
        }
    }

    fun getDescription() = "I'm a Double-Checked Locking Singleton!"

}
