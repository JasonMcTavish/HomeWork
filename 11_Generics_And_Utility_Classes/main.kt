package `11_Generics_And_Utility_Classes`

import kotlin.random.Random

fun main() {
val pistol:AbstractWeapon = Weapons.createPistol()
}

fun Int.chance(): Boolean {
    return Random.nextInt(0, 100) < this
}