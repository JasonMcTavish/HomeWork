package `08_OOP1`
import kotlin.random.Random
import kotlin.random.nextInt

open class Animal(val name: String, val maxAge: Int, var weight: Int, var energy: Int) {
    private var age: Int = Random.nextInt(0..maxAge + 1)
    open fun isTooOld(): Boolean = when (age) {
        in 0 until maxAge -> false
        else -> true
    }

    open fun sleeping() {
        if (age != maxAge)
            age++
        energy += 5
        println("$name - спит")
    }

    open fun eating() {
        energy += 3
        weight++
        tryIncrementAge()
        println("$name - ест")
    }

    open fun moving(): Boolean {
        return if (energy - 5 > 0 && weight - 1 > 0) {
            energy -= 5
            weight--
            tryIncrementAge()
            println("$name - передвигается")
            true
        } else false
    }

    private fun tryIncrementAge() {
        if (Random.nextBoolean()) age++
    }

    open fun offspring(): Animal {
        val child = Animal(
            name = name,
            maxAge = maxAge,
            weight = Random.nextInt(0..5),
            energy = Random.nextInt(0..10)
        )
        println("$name родила животное с именем: $name, энергией: $energy и весом $weight")
        return child
    }
}