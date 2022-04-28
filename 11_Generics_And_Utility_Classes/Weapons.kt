package `11_Generics_And_Utility_Classes`

import kotlin.random.Random
import kotlin.random.nextInt

object Weapons {
    fun createPistol(): AbstractWeapon {
        val weapon = AbstractWeapon(Random.nextInt(0, 15))
        weapon.fireType = FireType.SingleShot
        return weapon
    }

    fun createRifle(): AbstractWeapon {
        val weapon = AbstractWeapon(Random.nextInt(0, 5))
        weapon.fireType = FireType.SingleShot
        return weapon
    }

    fun createMachineGun(): AbstractWeapon {
        val weapon = AbstractWeapon(Random.nextInt(0, 15))
        weapon.fireType = FireType.BurstShooting(5)
        return weapon
    }

    fun createGrenade(): AbstractWeapon {
        val weapon = AbstractWeapon(1)
        weapon.fireType = FireType.SingleShot
        return weapon
    }
}