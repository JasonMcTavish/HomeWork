package `11_Generics_And_Utility_Classes`

class AbstractWeapon(val maxAmmo: Int) {
    var fireType = Any()

    val ammoMagazine = Stack<Ammo>()

    fun createAmmo(weapon: AbstractWeapon): Ammo {
        when (weapon){

    }
}

fun recharge() {

}

fun getAmmo() {

}
}