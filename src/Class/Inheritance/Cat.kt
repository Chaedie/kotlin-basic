package Class.Inheritance

/**
 * 1. 상속 받을 때 extends 대신 : 으로 상속
 * 2. 상속받을 때 상위 클래스 생성자를 바로 호출한다.
 * 3. override 라는 키워드를 사용한다.
 */
class Cat(
    species: String
) : Animal(species, 4) {

    override fun move() {
        println("고양이가 걸어가~")
    }
}
