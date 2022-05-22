package Generics_And_Utility_Classes

sealed class FireType() {
    object SingleShot : FireType()
    data class BurstShooting(val rateOfQueue: Int= 5) : FireType()
}
