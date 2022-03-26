package `09_OOP2`
abstract class DebitCard(numberOfCardArg: String, balanceArg: Int) : BankCard(numberOfCardArg, balanceArg) {

    override fun addCash(sumOfCash: Int) {
        balance += sumOfCash
        println("Баланс пополнен на $sumOfCash")
    }

    override fun pay(sumOfPay: Int): Boolean {
        if (sumOfPay > balance) {
            println("Недостаточно средств")
            return false
        } else
            balance -= sumOfPay
        return true
    }

    override fun getBalance() {
        println("Баланс составляет: $balance")
    }

    override fun getAvailableCash() {
        println(
            "Доступные средства:" +
                    "Собственные средства: $balance"
        )
    }
}