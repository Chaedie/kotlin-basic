package Class.Inheritance

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int,
) {
    abstract fun move()
}
