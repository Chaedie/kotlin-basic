package CodeControll

fun main() {

}

fun validateScoreIsNotNegative(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}의 범위는 0부터 100입니다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 90) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
//    if (score >= 90) {
//        return "A"
//    } else if (score >= 80) {
//        return "B"
//    } else if (score >= 70) {
//        return "C"
//    } else {
//        return "D"
//    }

    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch2(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    return when (number) {
        -1, 0, 1 -> println("어디서 많이 보던 숫자입니다.")
        else -> println("많이 보던 숫자가 아닙니다.")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}
