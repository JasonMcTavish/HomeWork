package `11_Generics_And_Utility_Classes`

class Soldier : AbstractWarrior() {
    override var chanceToEvade: Int = 15
    override val maxHealth: Int = 100
    override val accuracy: Int = 15
    override var weapon: AbstractWeapon = Weapons.createPistol()
    override var health: Int = 100
}