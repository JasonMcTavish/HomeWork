package Generics_And_Utility_Classes

open class AbstractWarrior(
    override var isKilled: Boolean,
    override var chanceToEvade: Int = 15,
    val maxHealth: Int = 100,
    open val accuracy: Int = 15,
    open var weapon: AbstractWeapon = Weapons.createPistol()
) : Warrior {
    open var health: Int = maxHealth
    open var ammoForFire: Ammo = Ammo.PistolAmmo


    override fun attack(warrior: Warrior) {
        var i = 0
        if (weapon.ammoMagazine.isEmpty()) {
            weapon.reloading()
        } else {
            if (weapon.fireType == FireType.SingleShot) {
                ammoForFire = weapon.getAmmo().pop()
                if (accuracy >= warrior.chanceToEvade) warrior.takeDamage(ammoForFire.dealingDamage(ammoForFire))
            } else
                for (j in 0 until FireType.BurstShooting(5).rateOfQueue) {
                    if (weapon.ammoMagazine.isEmpty()) break
                    ammoForFire = weapon.getAmmo().pop()
                    if (accuracy >= warrior.chanceToEvade) warrior.takeDamage(ammoForFire.dealingDamage(ammoForFire))
                }

        }
    }

    override fun takeDamage(damage: Int) {
        health -= damage
        if (health <= 0) isKilled = true
    }
}