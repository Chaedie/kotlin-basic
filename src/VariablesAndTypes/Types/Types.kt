package VariablesAndTypes.Types

import VariablesAndTypes.Person.Person

/**
 * 1. Kotlin 은 암시적인 타입 변환이 안된다.
 * 2. 타입변환을 위해선 toLong() 등 명시적으로 타입변환을 해줘야한다.
 */
fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()

    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?: 0L

}

/**
 * 1. instanceof -> is
 * 2. !is
 * 3. as
 * 4. as?
 */

fun printAgeIfPerson1(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.age)
    }
}

fun printAgeIfPerson2(obj: Any) {
    val person = obj as? Person
    println(person?.age)
}
