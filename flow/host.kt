package flow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.random.Random

object Host {
    private var numberInGame = mutableListOf<Int>()
    private var r = 0
    val flow = flow {
        while (r != 2) {
            yield()
            var number = Random.nextInt(1, 90)
            numberInGame.find { it == number } ?: run {
                numberInGame.add(number)
                emit(number)
                println("Выпало число $number ")
                delay(2000)
            }
        }
    }

    fun stopGame(gameIsOver: Boolean) {
        if (gameIsOver) {
            r = 2
        }

    }
}