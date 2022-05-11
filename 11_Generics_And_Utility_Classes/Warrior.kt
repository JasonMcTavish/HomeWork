package `11_Generics_And_Utility_Classes`

interface Warrior {

    var isKilled: Boolean
    val chanceToEvade: Int

    fun attack(warrior: Warrior)
    fun takeDamage(damage: Int)
}