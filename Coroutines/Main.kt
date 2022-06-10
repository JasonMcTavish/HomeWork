package Coroutines

import kotlinx.coroutines.*
import java.math.BigInteger

val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
    println("error from handler - ${throwable.message}")
}
val scope = CoroutineScope(Dispatchers.Default + exceptionHandler)
suspend fun main() {
    val fibo1 = Fibonacci
    val fibo2 = Fibonacci
    val fibo3 = Fibonacci
    val n1 = 10
    val n2 = 8000
    val n3 = 3000
        scope.launch {
            withTimeout(3000) {
                val a = fibo1.take(n1)
                println("Fibo №$n1 is $a")
            }
            withTimeout(3000) {
                val b = fibo2.take(n2)
                println("Fibo №$n2 is $b")
            }
            withTimeout(3000) {
                val c = fibo3.take(n3)
                println("Fibo №$n3 is $c")

            }
        }
    }





