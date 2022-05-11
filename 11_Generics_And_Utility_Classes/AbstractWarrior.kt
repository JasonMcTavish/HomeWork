package `11_Generics_And_Utility_Classes`

open class AbstractWarrior : Warrior {
    override var isKilled : Boolean = false
    override var chanceToEvade: Int = 15
    open val maxHealth: Int = 100
    open val accuracy: Int = 15
    open var weapon: AbstractWeapon = Weapons.createPistol()
    open var health: Int = 100


    override fun attack(warrior: Warrior) {
        var i = 0
        if (weapon.ammoMagazine.isEmpty()) weapon.recharge()
        else {
            if (weapon.fireType == FireType.SingleShot) {
                weapon.getAmmo()
                if (accuracy > warrior.chanceToEvade) warrior.takeDamage(weapon.typeOfAmmo.dealingDamage(weapon.typeOfAmmo))
            } else
                do {
                    if (weapon.ammoMagazine.isEmpty()) break
                    weapon.getAmmo()
                    if (accuracy > warrior.chanceToEvade) warrior.takeDamage(weapon.typeOfAmmo.dealingDamage(weapon.typeOfAmmo))
                    i++
                } while (i == 4)

        }
    }

    override fun takeDamage(damage: Int) {
        health -= damage
        if (health <= 0) isKilled = true
    }
}