package Coroutines

import kotlinx.coroutines.*
import java.math.BigInteger

object Fibonacci {
    private var valueNMinusTwo: BigInteger = (0).toBigInteger()
    private var valueNMinusOne: BigInteger = (1).toBigInteger()
    private var value: BigInteger = (1).toBigInteger()
    var j = 3
    suspend fun take(n: Int): BigInteger {
        while (j < n) {
            value = valueNMinusTwo + valueNMinusOne
            valueNMinusTwo = valueNMinusOne
            valueNMinusOne = value
            delay(5)
            println("Fibo $j is $value")
            j++


        }
        return value
    }

}

