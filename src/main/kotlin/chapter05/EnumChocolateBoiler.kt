package chapter05

enum class EnumChocolateBoiler {
    INSTANCE;

    var empty = true
        private set
    var boiled = false
        private set

    /**
     * 보일러에 우유와 초콜릿을 혼합한 재료를 넣음
     */
    fun fill() {
        if (empty) {
            empty = false
            boiled = false
        }
    }

    /**
     * 끓인 재료를 다음 단계로 넘김
     */
    fun drain() {
        if (!empty && boiled) {
            // 끓인 재료를 다음 단계로 넘김
            empty = true
        }
    }

    /**
     * 재료를 끓임
     */
    fun boil() {
        if (!empty && !boiled) {
            boiled = true
        }
    }

}
