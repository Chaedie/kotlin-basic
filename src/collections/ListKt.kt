package collections

fun main() {
    // 불변
    val numbers = listOf(100, 200)
    //    val emptyList = emptyList<Int>()

    // 가변
    val mutableNumbers = mutableListOf(100, 200)
    mutableNumbers.add(300)


    printNumbers(emptyList())

    // 하나 가져오기
    println(numbers[0])

    // for each
    for (number in numbers) {
        println(number)
    }

    // for
    for ((idx, value) in numbers.withIndex()) {
        println("$idx: $value")
    }

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY")


    for (key in oldMap.keys) {
        println("$key: $oldMap")
    }
    for ((key, value) in oldMap) {
        println("$key: $value")
    }
    
}

private fun printNumbers(numbers: List<Int>) {

}
