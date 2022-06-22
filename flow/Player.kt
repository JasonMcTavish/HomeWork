package flow

import kotlinx.coroutines.*

class Player(val name: String, private val numberOfCard: Int) {
    var hand = mutableListOf<PlayingCard>()
    val card = PlayingCard()
    init {
        addCard()
    }

    private fun addCard() {
        repeat(numberOfCard) {
            hand.add(card)
        }
    }

    fun checkForWin(playerCard: PlayingCard): Boolean {
        playerCard.card.forEach { it ->
            if (it.all { it == 0 }) {
                return true
            }
        }
        return false
    }

    fun closeNumber(playingCard: MutableList<Int>, drawnNumber: Int) {
        playingCard.forEach {
            if (drawnNumber == it) {
                playingCard[playingCard.indexOf(it)] = 0
            }
        }
    }

}