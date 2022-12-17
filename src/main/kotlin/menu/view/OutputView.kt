package menu.view

import menu.Coach

class OutputView {
    fun printStartMessage() {
        println(START_MESSAGE)
    }

    fun requestCoachNames() {
        println(REQUEST_COACH_NAME_MESSAGE)
    }

    fun requestCoachBias(coach: Coach) {
        println(coach.getName() + REQUEST_COACH_BIAS_MESSAGE)
    }

    companion object {
        const val START_MESSAGE = "점심 메뉴 추천을 시작합니다."
        const val REQUEST_COACH_NAME_MESSAGE = "코치의 이름을 입력해 주세요. (, 로 구분)"
        const val REQUEST_COACH_BIAS_MESSAGE = "(이)가 못 먹는 메뉴를 입력해 주세요."
    }
}