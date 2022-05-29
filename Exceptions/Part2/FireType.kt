package Exceptions.Part2

sealed class FireType() {
    object SingleShot : FireType()
    data class BurstShooting(val rateOfQueue: Int = 5) : FireType()
}
