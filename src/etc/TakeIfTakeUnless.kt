package etc


fun main() {

}

fun getNumberOrNull(number: Int): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}


// 조건 만족시 그 값
// 아니면 null
fun getNumberOrNullV2(number: Int): Int? {
    return number.takeIf { it > 0 }
}


// 주어진 조건을 만족하지 않으면 그 값,
// 아니면 null 반환
fun getNumberOrNullV3(number: Int): Int? {
    return number.takeUnless { it <= 0 }
}
