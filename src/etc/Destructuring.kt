package etc


fun main() {
    val person = Person("임채동", 100)
    //    val name = person.name
    //    val age = person.age
    val (name, age) = person

    //    componentN
    //    val name = person.component1()
    //    val age = person.component2()
    //    -> 순서가 중요하다... typescript 랑 다르게 순서대로 나온다... 이름대로가 아니고... 못쓸듯...

    println("$name, $age")

}

data class Person(
    val name: String,
    val age: Int,
)
