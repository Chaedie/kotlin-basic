package Class


/**
 * 1. field 만 선언하면 getter, setter 는 자동 생성
 * 2. constructor 라는 예약어는 생략 가능
 * 3. field 선언 생략 가능
 * 4. . 을 통해 바로 get, set 할 수 있다.
 * 5. Java에선 생성자에서 검증할 수 있었다. -> Kotlin 에선 body 에서 init 블록에서 검증가능하다.
 * 6. constructor 로 생성자를 추가할 수 있다.
 * 7. 하지만 코틀린에서는 주생성자와 Default Parameter 를 권장한다.
 * 8. Converting 의 경우 부생성자보다는 정적 팩토리 메서드를 사용하라.
 * 9. Custom Getter, Setter
 */


//class Person constructor(name: String, age: Int) {
//    val name: String = name
//    var age: Int = age
//}

//class Person(name: String, age: Int) {
//    val name: String = name
//    var age: Int = age
//}

//class Person(
//    val name: String,
//    var age: Int
//)

class Person(
    val name: String = "임채동",
    var age: Int = 30
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    constructor(name: String) : this(name, 1) {
        println("부생성자 1")
    }

    constructor() : this("홍길동") {
        println("부생성자 2")
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    // Custom Getter
    val isAdult: Boolean
        get() {
            return this.age >= 20
        }
//    get() = this.age >= 20


}

fun main() {
    val person = Person("임채동", 100)
    println(person.name)
    person.age = 30
    println(person.age)

    val person2 = JavaPerson("임채동", 100)
    println(person2.name)
    person2.age = 30
    println(person2.age)

    println()
    Person()
}
