package Class.nested

class KotlinInnerNested(
    private val address: String,
    private val livingRoom: LivingRoom,
) {
    inner class LivingRoom(
        private val area: Double,
    ) {
        val address: String
            get() = this@KotlinInnerNested.address
    }
}
