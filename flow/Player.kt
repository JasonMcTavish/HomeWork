package flow

class Player(val name: String, private val numberOfCard: Int) {
    var hand = mutableListOf<PlayingCard>()

    init {
        addCard()
    }

    private fun addCard() {
        repeat(numberOfCard) {
            hand.add(PlayingCard())
        }
    }

    fun checkForWin(playerCard: PlayingCard): Boolean {
        var i = 0
        playerCard.card.forEach {
            if (it == 0) {
                i++
            }
        }
        if (i == 14) {
            return true
        }
        return false
    }

    fun closeNumber(playingCard: PlayingCard, drawnNumber: Int) {
        playingCard.card.forEach {
            if (drawnNumber == it) {
                playingCard.card[playingCard.card.indexOf(it)] = 0
            }
        }
    }

}