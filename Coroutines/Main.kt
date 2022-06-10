package Coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.GlobalScope
import java.math.BigInteger
import kotlin.coroutines.CoroutineContext

val handler = CoroutineExceptionHandler { _, exception ->
    println("Error: ${exception.message}")
}
val scope = CoroutineScope(Dispatchers.Default + handler)
fun main(): Unit = runBlocking {
    val fibo1 = Fibonacci
    val fibo2 = Fibonacci
    val fibo3 = Fibonacci
    val n1 = 1000
    val n2 = 80
    val n3 = 300
    var a: BigInteger
    var b: BigInteger
    var c: BigInteger

    val job = scope.launch {
        val job2 = launch {
            for (i in 1..5000) {
                delay(10)
                if (i % 50 == 0) println(".")
                else print(".")
            }
        }
        try {
            withTimeout(3000) {
                a = fibo1.take(n1)
                println("Fibo №$n1 is $a")
            }
        } catch (e: TimeoutCancellationException) {
            println("Time out")
        }

        try {
            withTimeout(3000) {
                b = fibo2.take(n2)
                println("Fibo №$n2 is $b")
            }
        } catch (e: TimeoutCancellationException) {
            println("Time out")
        }
        try {
            withTimeout(3000) {
                c = fibo3.take(n3)
                println("Fibo №$n3 is $c")
            }
        } catch (e: TimeoutCancellationException) {
            println("Time out")
        }


        if (isActive) job2.cancelAndJoin()

    }
    job.join()
}











