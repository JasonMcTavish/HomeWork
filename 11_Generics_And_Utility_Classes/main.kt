package `11_Generics_And_Utility_Classes`

import kotlin.random.Random

fun main() {
println("Введите количество воинов")
    var numberOfWarrior :Int
    do {
       numberOfWarrior= readLine()?.toInt() ?: return
    }while (numberOfWarrior<=0)
    var battle : Battle = Battle(numberOfWarrior)




println()
    battle.iterationOfBattle()


}

fun Int.chance(): Boolean {
    return Random.nextInt(0, 100) < this
}

