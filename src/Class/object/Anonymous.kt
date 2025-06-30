package Class.`object`

fun main() {
    moveSomething(object : Movable {
        override fun move() {
            print("무브 부브")
        }

        override fun fly() {
            print("난다")
        }

    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}
