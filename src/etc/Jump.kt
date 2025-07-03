package etc

fun main() {

    val numbers = listOf(1, 2, 3)

    numbers.map { number -> number + 1 }
        .forEach { number -> println(number) }

    for (number in numbers) {
        if (number == 2) {
            break
        }
    }

    run {
        numbers.forEach { number ->
            if (number == 2) {
                return@run
                // break 와 동일
            }

        }
    }

    numbers.forEach { number ->
        if (number == 2) {
            return@forEach
        }
    }
}
