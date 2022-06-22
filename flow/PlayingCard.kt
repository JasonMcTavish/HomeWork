package flow

import kotlin.random.Random

class PlayingCard {
    val card = createCard()
    private fun createCard(): MutableList<MutableList<Int>> {
        var list = mutableListOf<Int>()
        for (i in 0 until 15) {
            var number = Random.nextInt(1, 90)
            list.find { it == number } ?: run {
                list.add(number)
            }
        }
        val zeroList = List(4) { 0 }
        val list2 = list.chunked(5).toMutableList()
        val firstLine = list2[0].toMutableList().plus(zeroList).toMutableList()
        firstLine.shuffle()
        val secondLine = list2[1].toMutableList().plus(zeroList).toMutableList()
        secondLine.shuffle()
        val thirdLine = list2[2].toMutableList().plus(zeroList).toMutableList()
        thirdLine.shuffle()
        return mutableListOf(firstLine, secondLine, thirdLine)
    }

    fun showCard() {
        println("--------------------------------------------")
        println(card.joinToString("\n"))
        println()
    }
}

