package Exceptions.Part2

abstract class AbstractWarrior(
    override var isKilled: Boolean,
    override var chanceToEvade: Int = 15,
    maxHealth: Int = 100,
    open val accuracy: Int = 15,
    open var weapon: AbstractWeapon = Weapons.createPistol()
) : Warrior {
    open var health: Int = maxHealth
    open var ammoForSingleFire = Ammo.PISTOLAMMO
    open var ammoForFire = Stack<Ammo>()


    override fun attack(warrior: Warrior) {
//        if (weapon.ammoMagazine.isEmpty()) {
//            weapon.reloading()
//        } else
        try {
            when (weapon.fireType) {
                is FireType.SingleShot -> {
                    ammoForSingleFire = weapon.getAmmo().pop()!!
                    if (accuracy >= warrior.chanceToEvade) {
                        warrior.takeDamage(
                            ammoForSingleFire.dealingDamage(
                                ammoForSingleFire
                            )
                        )
                    }
                }
                is FireType.BurstShooting -> {
                    ammoForFire = weapon.getAmmo()
                    for (j in 0 until FireType.BurstShooting().rateOfQueue) {
                        ammoForSingleFire = ammoForFire.pop()!!
                        if (accuracy >= warrior.chanceToEvade) warrior.takeDamage(
                            ammoForSingleFire.dealingDamage(
                                ammoForSingleFire
                            )
                        )
                    }

                }
            }
        } catch (e: NoAmmoException) {
            weapon.reloading()
        }
    }

    override fun takeDamage(damage: Int) {
        health -= damage
        if (health <= 0) isKilled = true
    }
}
