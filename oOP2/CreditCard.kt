package oOP2
abstract class CreditCard(
    numberOfCardArg: String,
    private var balanceArg: Int,
    private val maxCreditBalance: Int
) : BankCard(numberOfCardArg, balanceArg) {
    protected var creditBalance: Int = maxCreditBalance

    override fun addCash(sumOfCash: Int) {
        if (creditBalance < maxCreditBalance) {
            if (maxCreditBalance - creditBalance > sumOfCash) {
                creditBalance += sumOfCash
            } else {
                creditBalance = maxCreditBalance
                balance += sumOfCash - (maxCreditBalance - creditBalance)
            }
        } else balance += sumOfCash
        println("Баланс пополнен на $sumOfCash")
    }

    override fun pay(sumOfPay: Int): Boolean {
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
            return true

        }
    }

    override fun getBalance() {
        println("Баланс составляет:$balance")
    }

    override fun getAvailableCash() {
        println("Доступные средства:")
        println("Собственные средства: $balance")
        println("Кредитные средства: $creditBalance")

    }
}