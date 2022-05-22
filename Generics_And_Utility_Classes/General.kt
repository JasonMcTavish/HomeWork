package Generics_And_Utility_Classes

class General : AbstractWarrior(false,30,150,30,Weapons.createRifle()){
    override var ammoForSingleFire: Ammo = Ammo.RifleAmmo
}