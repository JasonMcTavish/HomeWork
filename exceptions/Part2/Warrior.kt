package exceptions.Part2

interface Warrior {

    var isKilled: Boolean
    val chanceToEvade: Int

    fun attack(warrior: Warrior)
    fun takeDamage(damage: Int)
}