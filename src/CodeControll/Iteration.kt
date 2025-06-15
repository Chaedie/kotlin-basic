package CodeControll

fun main() {

}

fun forEach() {
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }
}

fun forLoop() {
    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }
}

/**
 * Range: public operator fun rangeTo(other: Int): IntRange
 * step: public infix fun IntProgression.step(step: Int): IntProgression
 */
