package Coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.GlobalScope

fun main(): Unit = runBlocking {
    val handler = CoroutineExceptionHandler { _, exception ->
        println("Time out - ${exception.message}")
    }
    val fibo1 = Fibonacci
    val fibo2 = Fibonacci
    val fibo3 = Fibonacci
    val n1 = 10000
    val n2 = 80
    val n3 = 3000
    val job = GlobalScope.launch(handler) {
        launch {
            withTimeout(3600) {
                val a = fibo1.take(n1)
                println("Fibo №$n1 is $a")
            }
        }
        launch {
            withTimeout(3000) {
                val b = fibo2.take(n2)
                println("Fibo №$n2 is $b")
            }
        }
        launch {
            withTimeout(3000) {
                val c = fibo3.take(n3)
                println("Fibo №$n3 is $c")

            }
        }
    }
    job.join()
}









