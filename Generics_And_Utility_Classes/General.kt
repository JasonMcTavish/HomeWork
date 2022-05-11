package Generics_And_Utility_Classes

class General : AbstractWarrior(false,30,150,15) {
    override var weapon: AbstractWeapon = Weapons.createRifle()
}