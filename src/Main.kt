//    COMMIT 용 주석

fun main() {

    var number1 = 10L
    number1 = 5L

    val number2 = 10L
//    number2 = 5L

    var number3: Long? = 1_000L

    number3 = null


    var person = Person("임채동")

}

annotation class Person(val value: String)

fun startsWithA1(str: String?): Boolean {
//    if (str == null) {
//        throw IllegalArgumentException("null이 들어왔습니다.")
//    }
//    return str.startsWith("A")
//

    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean? {
    return str?.startsWith("A") ?: false
}


/**
 * null 을 위한 기능
 * 1. Safe Call (?)
 * 2. Elvis 연산자 (?:) 삼항처럼 널이면 뒤에꺼
 * 3. null 아니 단언
 */

fun elvis() {
    val str: String? = null
    val length = str?.length ?: 0
}

/** Early Return 에서의 엘비스 연산자 */
fun calculate(number: Long?): Long {
    // Early Return
    number ?: return 0

    return number
}

fun startsWith(str: String?): Boolean {
    // str이 절대 널이 아나리는 단언
    return str!!.startsWith("A")
}
