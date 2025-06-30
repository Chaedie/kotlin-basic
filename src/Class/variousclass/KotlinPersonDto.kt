package Class.variousclass

import Class.Person

fun main() {
    val person1 = Person("임채동", 100)
    val person2 = Person("임채동", 100)

    println(person1 == person2)
    println(person1 === person2)

}

data class PersonDto(
    val name: String,
    val age: Int,
)
