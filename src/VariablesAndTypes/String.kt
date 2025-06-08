package VariablesAndTypes

import VariablesAndTypes.Person.Person

fun main() {
    val person = Person("채디", 100)
    println("이름: ${person.name}")

    val hello = """
    
    안녕 코틀린~
    이것저것 좋은거 다 섞었구나 ㅋㅋ
    """.trimIndent()
    println(hello)

}
