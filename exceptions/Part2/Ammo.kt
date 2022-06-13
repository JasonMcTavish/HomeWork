package exceptions.Part2

enum class Ammo(private val damage: Int, private val chanceToCritical: Int, private val criticalDamage: Int) {
    PISTOLAMMO(10, 10, 2),
    RIFLEAMMO(20, 15, 3),
    MACHINEGUNAMMO(5, 5, 2),
    GRENADE(30, 20, 4);

    fun dealingDamage(ammo: Ammo): Int {
        return if (ammo.chanceToCritical.chance()) {
            ammo.damage * ammo.criticalDamage
        } else ammo.damage
    }
}

