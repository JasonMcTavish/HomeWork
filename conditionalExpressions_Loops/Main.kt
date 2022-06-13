package conditionalExpressions_Loops
fun main() {
    print("Choose method of the cycle.\n " +
            "Enter 1 - do with for \n " +
            "Or 2 - do with while:")
    var a = true
    var b = true
    do {
        val choose = readLine()?.toIntOrNull() ?: return
        when (choose) {
            1 -> do {
                print("Enter the sequence number:")
                val n = readLine()?.toIntOrNull() ?: return
                if (n > 0) {
                    a = false
                    b= false
                    println("Fibonacci number is:" + calculateFibFor(n))
                } else println("Incorrect the sequence number! Please enter the correct number!")
            } while (a)
            2 -> do {
                print("Enter the sequence number:")
                val n = readLine()?.toIntOrNull() ?: return
                if (n > 0) {
                    a = false
                    b= false
                    println("Fibonacci number is:" + calculateFibWhile(n))
                } else println("Incorrect the sequence number! Please enter the correct number!")
            } while (a)
            else -> println("Incorrect the number of method! Please enter the correct number!")
        }
    } while (b)


}

fun calculateFibWhile(n: Int): Long {
    var valueNMinusTwo: Long = 0
    var valueNMinusOne: Long= 1
    var value: Long = 0
    var j = 3
    when (n) {
        1 -> return valueNMinusTwo
        2 -> return valueNMinusOne
        else -> while (j <= n) {
            value = valueNMinusTwo + valueNMinusOne
            valueNMinusTwo = valueNMinusOne
            valueNMinusOne = value
            j++
        }
    }
    return value
}
fun calculateFibFor(n: Int): Long {
    var valueNMinusTwo: Long = 0
    var valueNMinusOne: Long = 1
    var value: Long =0
    when (n) {
        1 -> return valueNMinusTwo
        2 -> return valueNMinusOne
        else -> for (j in 3..n) {
            value = valueNMinusTwo + valueNMinusOne
            valueNMinusTwo = valueNMinusOne
            valueNMinusOne = value
        }

    }
    return value
}
