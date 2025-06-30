package Class.`object`

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

/**
 * 1. kt 에는 static 이라는게 없다.
 * 2. companion object (동행객체) - 클래스와 동행하는 유일한 오브젝트
 */
class Person private constructor(
    var name: String,
    var age: Int,
) {

    companion object Factory : Log {
        // const - 컴파일 시에 변수가 할당된다 (진짜 상수)
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name = name, age = MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스 동행 객체입니다.")
        }
    }
}

interface Log {
    fun log()
}


// 싱글톤 만들어주고 싶으면 object 를 사용하면된다.
object Singleton {
    var a: Int = 0
}
