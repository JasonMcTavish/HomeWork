package Exceptions.Part2

class Grenadier : AbstractWarrior(false, 15, 120, 15, Weapons.createGrenade()) {
    override var ammoForSingleFire: Ammo = Ammo.GRENADE
}