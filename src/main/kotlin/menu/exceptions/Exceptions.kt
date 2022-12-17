package menu.exceptions

class Exceptions {
    fun validateCoachNames(input: String) {
        val inputs = input.replace(" ","").split(",")
        require(inputs.size == inputs.distinct().size) {throw IllegalArgumentException(WRONG_DUPLICATE_COACH_INPUT)}
        require(inputs.all { it.length in 2..4 }) {throw IllegalArgumentException(WRONG_NAME_LENGTH_COACH_INPUT)}
        require(inputs.size in 2..5) {throw IllegalArgumentException(WRONG_NUMBER_COACH_INPUT)}
    }

    fun validateCoachBias(input: String) {
        val inputs = input.replace(" ","").split(",")
        require(inputs.size == inputs.distinct().size) {throw  IllegalArgumentException(WRONG_DUPLICATE_FOOD_INPUT)}
        require(inputs.size in 0..2) {throw IllegalArgumentException(WRONG_SIZE_FOOD_INPUT)}
    }

    companion object {
        const val WRONG_DUPLICATE_COACH_INPUT = "코치의 이름은 중복없이 입력해야 합니다."
        const val WRONG_NAME_LENGTH_COACH_INPUT = "코치의 이름은 2글자에서 4글자 사이여야 합니다."
        const val WRONG_NUMBER_COACH_INPUT = "2명에서 5명까지의 코치가 식사할 수 있습니다."
        const val WRONG_DUPLICATE_FOOD_INPUT = "음식 이름은 중복 없이 입력해야합니다."
        const val WRONG_SIZE_FOOD_INPUT = "못먹는 음식은 최소 0개에서 2개까지 입력 가능합니다."
    }
}