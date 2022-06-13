package oOP1
import kotlin.random.Random
import kotlin.random.nextInt

class Bird(
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
            println("летит")
        return true
    }

    override fun offspring(): Bird {
        val birdChild = Bird(
            nameArg = name,
            maxAgeArg = maxAge,
            weightArg = Random.nextInt(0..5),
            energyArg = Random.nextInt(0..10)
        )
        println("$name родила птицу с именем: $name, энергией: $energy и весом $weight")
        return birdChild
    }
}