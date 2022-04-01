package `10_OOP3`

interface CurrencyConverter {
    val currencyCode: String
    fun convertToRub(rub: Double): Double
}