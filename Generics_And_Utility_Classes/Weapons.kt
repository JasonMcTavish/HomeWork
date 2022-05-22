package Generics_And_Utility_Classes

import kotlin.random.Random

object Weapons {
    fun createPistol(): AbstractWeapon {
        return AbstractWeapon(Random.nextInt(5, 15), FireType.SingleShot, Ammo.PistolAmmo)
    }

    fun createRifle(): AbstractWeapon {
        return AbstractWeapon(Random.nextInt(3, 8), FireType.SingleShot, Ammo.RifleAmmo)
    }

    fun createMachineGun(): AbstractWeapon {
        return AbstractWeapon(Random.nextInt(5, 20), FireType.BurstShooting(5), Ammo.MachineGunAmmo)
    }

    fun createGrenade(): AbstractWeapon {
        return AbstractWeapon(1, FireType.SingleShot, Ammo.Grenade)
    }
}