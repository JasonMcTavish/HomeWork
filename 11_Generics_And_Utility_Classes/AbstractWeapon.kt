package `11_Generics_And_Utility_Classes`

class AbstractWeapon(val maxAmmo: Int) {
    var fireType = Any()
    var typeOfAmmo = Ammo.PistolAmmo
    var ammoMagazine = Stack<Ammo>()

    private fun createAmmo(): Ammo =
        when (typeOfAmmo) {
            Ammo.PistolAmmo -> Ammo.PistolAmmo
            Ammo.RifleAmmo -> Ammo.RifleAmmo
            Ammo.MachineGunAmmo -> Ammo.MachineGunAmmo
            Ammo.Grenade -> Ammo.Grenade
        }

    fun recharge() {
        var numberOfAmmo: Int = 0
        do {
            ammoMagazine.push(createAmmo())
            numberOfAmmo++
        } while (numberOfAmmo == maxAmmo)
    }

    fun getAmmo() {
        var i = 0
        if (ammoMagazine.isEmpty()) recharge()
        else {
            if (fireType == FireType.SingleShot) ammoMagazine.pop()
            else while (i != 4) {
                ammoMagazine.pop()
                i++
            }
        }
    }
}