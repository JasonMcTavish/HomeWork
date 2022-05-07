package `11_Generics_And_Utility_Classes`

class General : AbstractWarrior() {
    override var chanceToEvade: Int = 30
    override val maxHealth: Int = 150
    override val accuracy: Int = 30
    override var weapon: AbstractWeapon = Weapons.createRifle()
    override var health: Int = 150
}