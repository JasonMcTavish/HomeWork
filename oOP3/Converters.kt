package oOP3

object Converters {
    fun get(currencyCode: String, rub: Double) {
        when (currencyCode) {
            "Dol" -> println("$rub рублей - ${ConvertToDol().convertToRub(rub)} $currencyCode")
            "Euro" -> println("$rub рублей - ${ConvertToEuro().convertToRub(rub)} $currencyCode")
            else -> println("$rub рублей - ${ConvertToUnknown().convertToRub(rub)} $currencyCode")
        }
    }

}

class ConvertToDol() : CurrencyConverter {
    override val currencyCode = "Dol"

    override fun convertToRub(rub: Double): Double {
        return rub / 81.12
    }
}

class ConvertToEuro() : CurrencyConverter {
    override val currencyCode = "Euro"

    override fun convertToRub(rub: Double): Double {
        return rub / 93.45
    }
}

class ConvertToUnknown() : CurrencyConverter {
    override val currencyCode = "Unknown"

    override fun convertToRub(rub: Double): Double {
        var currencyRate: Double
        var a = true
        do {
            print("Enter the currency rate:")
            currencyRate = readLine()?.toDoubleOrNull()!!
            if (currencyRate != null) {
                if (currencyRate > 0.0) {
                    a = false
                } else println("Incorrect the currency rate! Please enter the correct rate!")
            }
        } while (a)
        return rub / currencyRate
    }
}
