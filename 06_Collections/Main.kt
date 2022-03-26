package `06_Collections`
fun main() {
    var n: Int
    val numbersPlusSeven = mutableListOf<String>()
    var numbersSet = setOf<String>()
    do {
        print("Введите количество номеров:")
        n = readLine()?.toIntOrNull() ?: return
        if (n < 0) println("Неправильное количество! Повторите попытку.")
    } while (n <= 0)

    var numbers = readNumbers(n) //Вызов функции считывания номеров
    numbers.forEach { numbers -> println(numbers.filter { numbers.startsWith("+7") }) } //Вывод номеров начинающихся на +7
    numbers.forEach { numbers ->
        if (numbers.startsWith("+7")) {
//            Можно вывести и тут. println(numbers)
            numbersPlusSeven.add(numbers) // Создание нового списка только с номерами на +7
        }
    }
    numbersSet = numbersPlusSeven.toSet()
    println("Количество уникальных номеров: ${numbersSet.size}")
    println("Сумма длин всех номеров: ${numbersSet.sumOf { numbersSet -> numbersSet.length }}")
    val numbersAndNames = readNames(numbersPlusSeven)
    val sortedPhones = numbersAndNames.toSortedMap()
    val sortedNames = numbersAndNames.toSortedMap()
    sortedPhones.forEach { entry -> println("Абонент: ${entry.value}. Номер телефона: ${entry.key}") }

}



fun readNumbers(n: Int): MutableList<String> { //Функция ввода с клавиатуры номеров.
    var numbers = mutableListOf<String>()
    for (it in 0 until n) {
        println("Введите телефон № ${it+1}")
        numbers.add(readLine().toString())
    }
    return numbers
}

fun readNames(but: MutableList<String>): MutableMap<String,String>{ //Функция ввода имен абонентов.
    var numbers = mutableMapOf<String, String>()
    var c:Int = 0
    for (i in but.indices) {
        println("Введите имя человека с номером телефона ${but[i]}.")
        numbers[but[i]] = readLine().toString()
    }
    return numbers
}