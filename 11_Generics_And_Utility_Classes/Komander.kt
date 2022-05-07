package `11_Generics_And_Utility_Classes`

class Captain : AbstractWarrior() {
    override var chanceToEvade: Int = 20
    override val maxHealth: Int = 140
    override val accuracy: Int = 20
    override var weapon: AbstractWeapon = Weapons.createMachineGun()
    override var health: Int = 140
}