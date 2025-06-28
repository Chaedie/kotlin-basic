package Class.Inheritance.interfaces

interface Flyable {
    // default 키워드 쓰지 않아도 default 메서드 만들 수 있다.
    fun act() {
        println("파닥 파닥")
    }

    fun fly()
}
