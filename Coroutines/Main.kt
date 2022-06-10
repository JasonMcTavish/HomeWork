package Coroutines

import kotlinx.coroutines.*
import java.math.BigInteger

suspend fun main() {
    val fibo1 = Fibonacci
    val fibo2 = Fibonacci
    val fibo3 = Fibonacci
    val n1 = 100
    val n2 = 8
    val n3 = 300
    runBlocking {

        launch {
            val a = fibo1.take(n1)
            println("Fibo №$n1 is $a")
        }

        launch {
            val b = fibo2.take(n2)
            println("Fibo №$n2 is $b")
        }

        launch {
            val c = fibo3.take(n3)
            println("Fibo №$n3 is $c")

        }
    }
}




