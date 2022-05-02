package `11_Generics_And_Utility_Classes`

import kotlin.random.Random

object Weapons {
    fun createPistol(): AbstractWeapon {
        val weapon = AbstractWeapon(Random.nextInt(0, 15))
        weapon.fireType = FireType.SingleShot
        weapon.typeOfAmmo = Ammo.PistolAmmo
        return weapon
    }

    fun createRifle(): AbstractWeapon {
        val weapon = AbstractWeapon(Random.nextInt(0, 5))
        weapon.fireType = FireType.SingleShot
        weapon.typeOfAmmo = Ammo.RifleAmmo
        return weapon
    }

    fun createMachineGun(): AbstractWeapon {
        val weapon = AbstractWeapon(Random.nextInt(0, 15))
        weapon.fireType = FireType.BurstShooting(5)
        weapon.typeOfAmmo = Ammo.MachineGunAmmo
        return weapon
    }

    fun createGrenade(): AbstractWeapon {
        val weapon = AbstractWeapon(1)
        weapon.fireType = FireType.SingleShot
        weapon.typeOfAmmo = Ammo.Grenade
        return weapon
    }
}