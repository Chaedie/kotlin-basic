package Class.nested

fun main() {

}

class KotlinHouse(
    private val address: String,
    private val livingRom: LivingRoom
) {

    class LivingRoom(
        private val area: Double,
    )
}
