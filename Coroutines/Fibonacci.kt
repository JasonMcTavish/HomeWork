package Coroutines

import kotlinx.coroutines.*
import java.math.BigInteger

object Fibonacci {

    suspend fun take(n: Int): BigInteger  {

        var valueNMinusTwo: BigInteger = (0).toBigInteger()
        var valueNMinusOne: BigInteger = (1).toBigInteger()
        var value: BigInteger = (1).toBigInteger()
        var j = 3
        return when (n) {
            1 -> (0).toBigInteger()
            2 -> (1).toBigInteger()
            else -> {
                while (j <= n) {
                    value = valueNMinusTwo + valueNMinusOne
                    valueNMinusTwo = valueNMinusOne
                    valueNMinusOne = value
                    delay(100)
                    j++

                }
                return value
            }
        }

    }
}

