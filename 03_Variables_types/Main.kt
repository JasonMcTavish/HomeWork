package `03_Variables_types`
fun main() {
    val firstName: String = "Aleksandr"
    val lastName: String = "Aleynikov"
    var height: Double = 1.70
    val weight: Float = 92.3f
    val isChild = {a : Double, b: Float -> a < 1.5 || b < 40f}
    val info = {a: String,b: String,c: Double,d: Float,e: Boolean -> println("My name is $a and my surname $b. " +
            "My height is $c and weight is $d. I'm a child is $e. ")}
    info(firstName, lastName, height, weight, isChild(height,weight))
    height = 1.45
    info(firstName, lastName, height, weight, isChild(height,weight))
}