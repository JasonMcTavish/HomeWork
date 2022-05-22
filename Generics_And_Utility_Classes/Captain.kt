package Generics_And_Utility_Classes

class Captain : AbstractWarrior(false,20,140,20,Weapons.createMachineGun()) {
    override var ammoForSingleFire: Ammo = Ammo.MACHINEGUNAMMO

}