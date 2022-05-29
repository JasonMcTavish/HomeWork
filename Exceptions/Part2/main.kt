package Exceptions.Part2

import kotlin.random.Random

fun main() {
    println("Введите количество воинов")
    var numberOfWarrior: Int
    numberOfWarrior = readLine()?.toIntOrNull() ?: 2
    val battle = Battle(numberOfWarrior)

    battle.iterationOfBattle()


}

fun Int.chance(): Boolean {
    return Random.nextInt(0, 100) < this
}

