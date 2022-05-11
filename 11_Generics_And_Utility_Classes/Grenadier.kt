package `11_Generics_And_Utility_Classes`

class Grenadier : AbstractWarrior(false,15,120,15) {
    override var weapon: AbstractWeapon = Weapons.createGrenade()
}