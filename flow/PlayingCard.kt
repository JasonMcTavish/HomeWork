package flow

import kotlin.random.Random

class PlayingCard {
    val card = mutableListOf<Int>()
    init {
        do {
            val number = Random.nextInt(1, 90)
            card.find { it == number } ?: run {
                card.add(number)
            }
        }while(card.size<15)
        card.sort()
    }

    fun showCard() {
        val field = """
            ------------------------
            |${card[0]}|0|0|${card[1]}|${card[2]}|0|${card[3]}|0|${card[4]}|
            |0|${card[5]}|0|${card[6]}|${card[7]}|0|${card[8]}|${card[9]}|0|
            |0|0|${card[10]}|${card[11]}|0|${card[12]}|${card[13]}|0|${card[14]}|
            ------------------------
        """.trimIndent()
        println(field)
    }
}

