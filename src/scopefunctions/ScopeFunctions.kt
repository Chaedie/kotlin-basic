package scopefunctions

import Class.Person


fun main() {

    val person = Person("임채동", 100)
    printPerson(person)

}

// ?. : sage Call
// let: scope function 의 한 종류
fun printPerson(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
    //    if (person != null) {
    //        println(person.name)
    //        println(person.age)
    //    }

    //    확장함수 let, run, also, apply
    //    with

    //                it 사용    this 사용
    // 람다의 결과 반환   let,      run
    // 객체 그 자체 반환  also,     apply
    //                with

    val person2 = Person("임채동", 100)
    val value1 = person2.let {
        it.age
    }

    val value2 = person2.run {
        this.age
    }

    val value3 = person2.also {
        it.age
    }

    val value4 = person2.apply {
        this.age
    }



    println("value1 = ${value1}") // 100
    println("value2 = ${value2}") // 100
    println("value3 = ${value3}") // Class.Person@ffffff
    println("value4 = ${value4}") // Class.person@ffffff

    with(person2) {
        println("with name ${name}")
        println("with age ${this.age}")
    }

}


fun example(str: String?) {

    // let: 하나 이상의 함수를 call chain 결과로 호출 할 때
    val strings = listOf("APPLE", "CAR")
    strings.map { it.length }
        .filter { it > 3 }
        .let(::println)
    //  .let(lengths -> println(lengths)

    // non-null 값에 대해서만 code block을 실행시킬 때
    val length = str?.let {
        println(it.uppercase())
        it.length
    }

    // 일회성으로 제한된 영역에 지역 변수를 만들 때  -> 변수 사용하는게 나을 수도 있음
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "!$firstItem!"
        }.uppercase()
    println(modifiedFirstItem)

    //
    val personRepository = PersonRepository()
    val person = Person("임채동", 100).run(personRepository::save)
    // val person = personRepository.save(Person("임채동", 100))
}


class PersonRepository {
    fun save(): Person {
        return Person("<UNK>", 100)
    }
}
