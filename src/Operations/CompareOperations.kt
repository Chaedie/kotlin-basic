package Operations


/**
 * 1. 연산자는 Java 와 동일하다.
 *    다른 점으로는 CompareTo를 자동으로 적용해준다.
 * 2. 동등성과 동일성
 *    Kotlin 에서는 동일성에 ===, 동등성에 == 을 하면 equals를 간접적으로 호출해준다.
 */
fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) {
        println("Money1이 Money2 보다 금액이 큽니다.")
    }

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    println()
    println("money3 === money4: ${money3 === money4}")
    println("money3 === money5: ${money3 === money5}")
    println("money3 == money4: ${money3 == money4}")
    println("money3 == money5: ${money3 == money5}")

}
