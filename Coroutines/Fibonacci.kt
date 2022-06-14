package Coroutines

import kotlinx.coroutines.*
import java.math.BigInteger

object Fibonacci {
    suspend fun take(n: Int): BigInteger {
        yield()
        var valueNMinusTwo: BigInteger = (0).toBigInteger()
        var valueNMinusOne: BigInteger = (1).toBigInteger()
        var j = 3
        return if (n in 0..1) n.toBigInteger()
        else {
            try {
                withTimeout(3000) {
                    repeat(n) {
                        valueNMinusTwo += valueNMinusOne
                        valueNMinusOne = valueNMinusTwo - valueNMinusOne

                        delay(10)
                    }
                }
            } catch (e: TimeoutCancellationException) {
                print("\nTime out")
                return (4).toBigInteger()
            }
            return valueNMinusTwo
        }

    }
}



