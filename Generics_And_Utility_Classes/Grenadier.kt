package Generics_And_Utility_Classes

class Grenadier : AbstractWarrior(false, 15, 120, 15, Weapons.createGrenade()) {
    override var ammoForSingleFire: Ammo = Ammo.GRENADE
}