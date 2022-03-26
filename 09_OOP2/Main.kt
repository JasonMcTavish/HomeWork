package `09_OOP2`
fun main() {
    val goldCard = GoldCard("554658565", 10000, 10000)
    goldCard.getAvailableCash()
    println()
    goldCard.pay(20000)
    println()

    goldCard.getAvailableCash()
    val alphaCard = AlphaCard("10305500", 10000)
    alphaCard.addCash(5000)
    println()
    alphaCard.addCash(50000)
    alphaCard.getAvailableCash()
}

