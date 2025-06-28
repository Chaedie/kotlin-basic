package Class.Inheritance

import Class.Inheritance.interfaces.Flyable
import Class.Inheritance.interfaces.Swimmable

class Penguin(
    species: String,
) : Animal(species, 2), Swimmable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직인다~")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount
    override val swimAbility: Int
        get() = TODO("Not yet implemented")


    override fun act() {
        super<Swimmable>.act()
        super<Flyable>.act()
    }

    override fun fly() {
        TODO("Not yet implemented")
    }

}
