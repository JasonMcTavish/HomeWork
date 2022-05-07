package `11_Generics_And_Utility_Classes`

class Grenadier : AbstractWarrior() {
    override var chanceToEvade: Int = 15
    override val maxHealth: Int = 120
    override val accuracy: Int = 15
    override var weapon: AbstractWeapon = Weapons.createGrenade()
    override var health: Int = 120
}