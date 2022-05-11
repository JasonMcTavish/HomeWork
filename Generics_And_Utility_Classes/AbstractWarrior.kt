package Generics_And_Utility_Classes

open class AbstractWarrior(
    override var isKilled: Boolean,
    override var chanceToEvade: Int = 15,
    open val maxHealth: Int = 100,
    open val accuracy: Int = 15
) : Warrior {
    open var weapon: AbstractWeapon = Weapons.createPistol()
    open var health: Int = maxHealth


    override fun attack(warrior: Warrior) {
        var i = 0
        if (weapon.ammoMagazine.isEmpty()) weapon.reloading()
        else {
            if (weapon.fireType == FireType.SingleShot) {
                weapon.getAmmo()
                if (accuracy > warrior.chanceToEvade) warrior.takeDamage(weapon.typeOfAmmo.dealingDamage(weapon.typeOfAmmo))
            } else
               for (j in 0..FireType.BurstShooting(5).rateOfQueue) {
                    if (weapon.ammoMagazine.isEmpty()) break
                    weapon.getAmmo()
                    if (accuracy > warrior.chanceToEvade) warrior.takeDamage(weapon.typeOfAmmo.dealingDamage(weapon.typeOfAmmo))
                    i++
                }

        }
    }

    override fun takeDamage(damage: Int) {
        health -= damage
        if (health <= 0) isKilled = true
    }
}