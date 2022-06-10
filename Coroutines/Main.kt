package Coroutines

import kotlinx.coroutines.*
import java.math.BigInteger


suspend fun main() {
    runBlocking {
        launch {
            val a = Fibonacci.take(3)
            println("Fibonacci №3 is $a")
        }
        launch {
            val c = Fibonacci.take(5)
            println("Fibonacci №5 is $c")
        }
        launch {
            val b = Fibonacci.take(8)
            println("Fibonacci №8 is $b")
        }
    }
}

