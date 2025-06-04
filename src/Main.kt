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
