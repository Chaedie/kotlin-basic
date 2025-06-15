package CodeControll

fun main() {
    repeat("Hello World")
    printNameAndGender(gender = "MALE", name = "임채동")

    printAll("A", "B", "C")
    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

/**
 * 1. 함수 선언 문법
 * 2. default parameter
 * 3. named argument
 * 4. 같은 타입의 여러 파라미터 받기 (가변인자)
 */

// 1. 함수 선언 문법
fun max(a: Int, b: Int): Int = if (a > b) a else b

// 2. default parameter
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

// 3. named argument
fun printNameAndGender(name: String, gender: String) {
    println("name = ${name}")
    println("gender = ${gender}")
}

// 4. 가변인자
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}
