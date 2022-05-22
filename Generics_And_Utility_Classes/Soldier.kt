package Generics_And_Utility_Classes

class Soldier : AbstractWarrior(false,15,100, accuracy = 15){
    override var ammoForFire: Ammo = Ammo.PistolAmmo
}