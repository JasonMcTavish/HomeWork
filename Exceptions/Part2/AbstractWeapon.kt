package Exceptions.Part2

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
                if (ammoMagazine.isEmpty()) throw NoAmmoException()
                else stackForFire.push(ammoMagazine.pop()!!)
            }
            is FireType.BurstShooting -> {
                if (ammoMagazine.size() < FireType.BurstShooting().rateOfQueue) throw NoAmmoException()
                else {
                    for (i in 0 until FireType.BurstShooting().rateOfQueue)
                        stackForFire.push(ammoMagazine.pop()!!)
                }
            }
        }
        return stackForFire
    }
}

class NoAmmoException : Throwable(message = "No ammo for fire")

fun Stack<Ammo>.size(): Int {
    return collection.size
}