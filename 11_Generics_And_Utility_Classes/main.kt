package `11_Generics_And_Utility_Classes`

import kotlin.random.Random

fun main() {
    var numberOfWarrior: Int = 1
    println("Введите количество воинов:")
    do {
        numberOfWarrior = readLine()?.toIntOrNull() ?: return
        if (numberOfWarrior <= 0) println("Попробуйте ввести снова")
    } while (numberOfWarrior <= 0)

println()
    Battle().iterationOfBattle(numberOfWarrior)


}

fun Int.chance(): Boolean {
    return Random.nextInt(0, 100) < this
}

