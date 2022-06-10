package Coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.GlobalScope
import java.math.BigInteger

fun main() = runBlocking {
    val handler = CoroutineExceptionHandler { _, exception ->
        println("Time out - ${exception.message}")
    }

    val fibo1 = Fibonacci
    val fibo2 = Fibonacci
    val fibo3 = Fibonacci
    val n1 = 1000
    val n2 = 80
    val n3 = 30
    val job = CoroutineScope(handler).launch {
        launch {
            withTimeout(3000){
                val a = fibo1.take(n1)
                println("Fibo №$n1 is $a")
            }
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
    job.join()
}








