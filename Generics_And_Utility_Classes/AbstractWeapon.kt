package Generics_And_Utility_Classes

class AbstractWeapon(val maxAmmo: Int, var fireType: FireType, var typeOfAmmo: Ammo) {
    var ammoMagazine= Stack<Ammo>()

    private fun createAmmo(): Ammo {
        return when (typeOfAmmo) {
            Ammo.PistolAmmo -> Ammo.PistolAmmo
            Ammo.RifleAmmo -> Ammo.RifleAmmo
            Ammo.MachineGunAmmo -> Ammo.MachineGunAmmo
            Ammo.Grenade -> Ammo.Grenade
        }
    }

    fun reloading() {
        val newMagazine=Stack<Ammo>()
        for (i in 0 until maxAmmo) {
            newMagazine.push(createAmmo())
        }
        ammoMagazine = newMagazine

    }

    fun getAmmo(): Stack<Ammo> {
        var stackForFire = Stack<Ammo>()
        var i = 0
            if (fireType == FireType.SingleShot) {
                stackForFire.push(ammoMagazine.pop())
                return stackForFire
            } else {
                for (i in 0 until FireType.BurstShooting(5).rateOfQueue )
                    stackForFire.push(ammoMagazine.pop())
        }
        return stackForFire
    }
}