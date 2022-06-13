package oOP1
import kotlin.random.Random
import kotlin.random.nextInt

class Fish(
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
            println("плывет")
        return true
    }

    override fun offspring(): Fish {
        val fishChild = Fish(
            nameArg = name,
            maxAgeArg = maxAge,
            weightArg = Random.nextInt(0..5),
            energyArg = Random.nextInt(0..10)
        )
        println("$name родила рыбу с именем: $name, энергией: $energy и весом $weight")
        return fishChild
    }
}