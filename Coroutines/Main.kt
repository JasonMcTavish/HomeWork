package Coroutines

import Coroutines.Fibonacci.take
import kotlinx.coroutines.*

val scope = CoroutineScope(Dispatchers.Default)
fun main(): Unit = runBlocking {
    val n1 = 100
    val n2 = 8000
    val n3 = 300
    val job = scope.launch {
        val job2 = launch {
            for (i in 1..50000) {
                delay(10)
                if (i % 50 == 0) println(".")
                else print(".")
            }
        }
        val a = async { take(n1) }
        val b = async { take(n2) }
        val c = async { take(n3) }
        awaitAll(a, b, c).forEach {
            run {
                if (it != (4).toBigInteger()) println("\n$it")
            }
        }
        if (isActive) job2.cancelAndJoin()
    }
    job.join()
}











