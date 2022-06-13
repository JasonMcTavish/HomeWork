package oOP1
import kotlin.random.Random
import kotlin.random.nextInt

class NatureReserve {
    private val bird1 = Bird("Птица1", 10, 10, 10)
    private val bird2 = Bird("Птица2", 11, 11, 11)
    private val bird3 = Bird("Птица3", 12, 12, 12)
    private val bird4 = Bird("Птица4", 13, 13, 13)
    private val bird5 = Bird("Птица5", 14, 14, 14)
    private val fish1 = Fish("Рыба1", 2, 1, 5)
    private val fish2 = Fish("Рыба2", 3, 2, 6)
    private val fish3 = Fish("Рыба3", 4, 3, 7)
    private val dog1 = Dog("Собака1", 15, 20, 15)
    private val dog2 = Dog("Собака2", 16, 21, 16)
    private val animal1 = Animal("Животное1", 5, 15, 18)
    private val animal2 = Animal("Животное2", 5, 15, 18)
    private var listOfAnimal =
        mutableListOf(bird1, bird2, bird3, bird4, bird5, fish1, fish2, fish3, dog1, dog2, animal1, animal2)

    fun natureLife() {
        var n: Int
        var a = true
        do {
            print("Введите количество итераций зоопарка")
            n = readLine()?.toIntOrNull() ?: return
            if (n > 0) {
                a = false
            } else println("Неверное количество итераций!")
        } while (a)
        for (it in 0 until n) {
            if (natureLifeForDay()) {
                println("Животные вымерли")
                break
            }
            Thread.sleep(10000)
        }
    }

    private fun natureLifeForDay(): Boolean {
        val listOfNewAnimal = mutableListOf<Animal>()
        val listOfOldAnimal = mutableListOf<Animal>()
        listOfAnimal.forEach {
            when (Random.nextInt(1..4)) {
                1 -> it.moving()
                2 -> it.sleeping()
                3 -> it.eating()
                4 -> listOfNewAnimal.add(it.offspring())
            }
        }
        listOfAnimal.forEach {
            if (it.isTooOld()) {
                listOfOldAnimal.add(it)
            }
        }
        listOfAnimal += listOfNewAnimal
        listOfAnimal -= listOfOldAnimal.toSet()
        println("Количество животных в зоопарке: ${listOfAnimal.size}")
        return listOfAnimal.size == 0
    }
}