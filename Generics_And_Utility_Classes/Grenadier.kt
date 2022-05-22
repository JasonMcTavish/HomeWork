package Generics_And_Utility_Classes

class Grenadier : AbstractWarrior(false, 15, 120, 15, Weapons.createGrenade()) {
    override var ammoForFire: Ammo = Ammo.Grenade
}