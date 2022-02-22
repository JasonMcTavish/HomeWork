class GoldCard(
    numberOfCardArg: String,
    balanceArg: Int,
    maxCreditBalanceArg: Int
) : CreditCard(
    numberOfCardArg,
    balanceArg,
    maxCreditBalanceArg
) {
    private var cashBack: Int = 0

    //Кэшбек 5% при покупке больше 5000
    override fun pay(sumOfPay: Int): Boolean {
        if (sumOfPay > 5000) {
            cashBack += (sumOfPay * 0.05).toInt()
            if (balance > sumOfPay) {
                balance -= sumOfPay
                return true
            } else {
                if (sumOfPay > creditBalance + balance) {
                    println("Недостаточно средств")
                    return false
                } else {
                    creditBalance -= sumOfPay - balance
                }
                balance = 0
                balance += cashBack
                return true
            }

        } else return super.pay(sumOfPay)
    }


}
