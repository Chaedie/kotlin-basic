package CodeControll

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    readFile()

}

/**
 * 1. try - catch
 * 2. Checked, UnChecked
 * 3. try with resources
 */

// 1. Try - Catch
fun parseIntOrThrows(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

fun parseIntOrNull(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

// 2. Checked / UnChecked
// Checked Exception 인 IOException 에 대한 경고문이 생기지 않는다.
// JAVA 와 다르게 모두 Unchecked Exception 으로 간주한다.
fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + " /a.txt", "input.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

// 3. Try with resources
// Kotlin 에는 Try with resources 구문이 없다.
// 대신 use 를 사용한다.
fun readFile(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}
