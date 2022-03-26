package `08_OOP1`
import kotlin.random.Random
import kotlin.random.nextInt

class Dog(
    nameArg: String,
    maxAgeArg: Int,
    weightArg: Int,
    energyArg: Int
) : Animal(
    nameArg,
    maxAgeArg,
    weightArg,
    energyArg
) {
    override fun moving(): Boolean {
        if (super.moving())
            println("бежит")
        return true
    }

    override fun offspring(): Dog {
        val dogChild = Dog(
            nameArg = name,
            maxAgeArg = maxAge,
            weightArg = Random.nextInt(0..5),
            energyArg = Random.nextInt(0..10)
        )
        println("$name родила пса с именем: $name, энергией: $energy и весом $weight")
        return dogChild
    }
}