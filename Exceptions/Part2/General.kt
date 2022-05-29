package Exceptions.Part2

class General : AbstractWarrior(false, 30, 150, 30, Weapons.createRifle()) {
    override var ammoForSingleFire: Ammo = Ammo.RIFLEAMMO
}