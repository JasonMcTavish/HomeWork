package Coroutines

import kotlinx.coroutines.*
import java.math.BigInteger


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

    val job = scope.launch {

        val job2 = launch {
            for (i in 1..50000) {
                delay(10)
                if (i % 50 == 0) println(".")
                else print(".")
            }
        }
        val a = async { fibo1.take(n1) }
        val b = async { fibo1.take(n2) }
        val c = async { fibo1.take(n3) }
       awaitAll(a,b,c).forEach{it ->
           run {
               if (it != (4).toBigInteger()) println(it)
               else print("")
           }
       }
        if (isActive) job2.cancelAndJoin()

    }
    job.join()
}











