package `11_Generics_And_Utility_Classes`

class Captain : AbstractWarrior(false,20,140,20) {
    override var weapon: AbstractWeapon = Weapons.createMachineGun()
}