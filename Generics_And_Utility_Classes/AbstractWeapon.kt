package Generics_And_Utility_Classes

abstract class AbstractWeapon(val maxAmmo: Int, var fireType: FireType) {
    var ammoMagazine = Stack<Ammo>()
   open var typeOfAmmo: Ammo = Ammo.PISTOLAMMO

    private fun createAmmo(): Ammo {
        return when (typeOfAmmo) {
            Ammo.PISTOLAMMO -> Ammo.PISTOLAMMO
            Ammo.RIFLEAMMO -> Ammo.RIFLEAMMO
            Ammo.MACHINEGUNAMMO -> Ammo.MACHINEGUNAMMO
            Ammo.GRENADE -> Ammo.GRENADE
        }
    }

    fun reloading() {
        val newMagazine = Stack<Ammo>()
        for (i in 0 until maxAmmo) {
            newMagazine.push(createAmmo())
        }
        ammoMagazine = newMagazine

    }

    fun getAmmo(): Stack<Ammo> {
        val stackForFire = Stack<Ammo>()
        when (fireType) {
            is FireType.SingleShot -> {
                stackForFire.push(ammoMagazine.pop())
            }
            is FireType.BurstShooting -> {
                for (i in 0 until FireType.BurstShooting().rateOfQueue)
                    if (ammoMagazine.isEmpty()) break
                stackForFire.push(ammoMagazine.pop())
            }
        }
        return stackForFire
    }
}