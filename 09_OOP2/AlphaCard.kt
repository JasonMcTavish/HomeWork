open class AlphaCard(numberOfCardArg: String, balanceArg: Int) : DebitCard(numberOfCardArg, balanceArg) {
    private var cashSavings: Double = 0.0
    private var sumOfCashSavings: Double = 0.0

    //накопление 0,0005% от суммы пополнений
    override fun addCash(sumOfCash: Int) {
        cashSavings = sumOfCash * 0.0005
        sumOfCashSavings += cashSavings
        super.addCash(sumOfCash + cashSavings.toInt())
        println("Процент от суммы начисления составил: ${cashSavings.toInt()}")
    }

    override fun getAvailableCash() {
        println("Доступные средства:")
        println("Собственные средства: $balance")
        println("Сумма начисленных процентов: ${sumOfCashSavings.toInt()}")
    }
}