package Exceptions.Part2

import kotlin.random.Random

object Weapons {
    fun createPistol(): AbstractWeapon {
        return object : AbstractWeapon(Random.nextInt(5, 15), FireType.SingleShot) {}
    }

    fun createRifle(): AbstractWeapon {
        return object : AbstractWeapon(8, FireType.SingleShot) {
            override var typeOfAmmo = Ammo.RIFLEAMMO
        }
    }

    fun createMachineGun(): AbstractWeapon {
        return object : AbstractWeapon(Random.nextInt(5, 20), FireType.BurstShooting(5)) {
            override var typeOfAmmo = Ammo.MACHINEGUNAMMO
        }
    }

    fun createGrenade(): AbstractWeapon {
        return object : AbstractWeapon(1, FireType.SingleShot) {
            override var typeOfAmmo = Ammo.GRENADE
        }
    }
}