package flow

import kotlinx.coroutines.*

fun main() {
    val player1 = Player("Adam", 2)
    val player2 = Player("Eva", 2)
    var gameIsOver = false
    runBlocking {
        val job = launch {
            Host.flow.collect {
                val status1 = play(it, player1)
                val status2 = play(it, player2)
                player1.hand.forEach { it.showCard() }
                player1.hand.forEach { it.showCard() }
                if (status1 || status2) gameIsOver = true
                Host.stopGame(gameIsOver)
                if (gameIsOver) {
                    cancel()
                }
            }
        }
        job.join()
        launch {
            player1.hand.forEach { it.showCard() }
            player2.hand.forEach { it.showCard() }
        }
    }
}


suspend fun play(drawnNumber: Int, player: Player): Boolean {
    player.hand.forEach {
        it.card.forEach { player.closeNumber(it, drawnNumber) }
        if (player.checkForWin(it)) return true
    }
    return false
}