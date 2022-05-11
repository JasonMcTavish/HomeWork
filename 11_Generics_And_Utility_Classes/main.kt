package `11_Generics_And_Utility_Classes`

import kotlin.random.Random

fun main() {

    var battle : Battle = Battle()




println()
    Battle().iterationOfBattle()


}

fun Int.chance(): Boolean {
    return Random.nextInt(0, 100) < this
}

