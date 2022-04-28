package `11_Generics_And_Utility_Classes`

enum class Ammo(private val damage: Int, private val chanceToCritical: Int, private val criticalDamage: Int) {
    PistolAmmo(10, 10, 2),
    RifleAmmo(20, 15, 3),
    MachineGunAmmo(5, 5, 2),
    Grenade(30,20,4);

    fun dealingDamage(ammo: Ammo): Int {
        return if(ammo.chanceToCritical.chance())
        {ammo.damage*ammo.criticalDamage}
        else ammo.damage
    }
}