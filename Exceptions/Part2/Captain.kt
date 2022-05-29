package Exceptions.Part2

class Captain : AbstractWarrior(false, 20, 140, 20, Weapons.createMachineGun()) {
    override var ammoForSingleFire: Ammo = Ammo.MACHINEGUNAMMO

}