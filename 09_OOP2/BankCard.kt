package `09_OOP2`
abstract class BankCard(numberOfCard: String, protected var balance: Int) {

    abstract fun addCash(sumOfCash: Int)
    abstract fun pay(sumOfPay: Int): Boolean
    abstract fun getBalance()
    abstract fun getAvailableCash()
}