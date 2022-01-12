fun main(){
//    val firstName: String = "Aleksandr"
//    val lastName: String = "Aleynikov"
//    var height: Double = 1.70
//    val weight: Float = 92.3f
//    val isChild = {a : Double, b: Float -> a < 1.5 || b < 40f}
//    val info = {a: String,b: String,c: Double,d: Float,e: Boolean -> println("My name is $a and my surname $b. " +
//            "My height is $c and weight is $d. I'm a child is $e. ")}
//    info(firstName, lastName, height, weight, isChild(height,weight))
//    height = 1.45
//    info(firstName, lastName, height, weight, isChild(height,weight))
    val codedString = """F2p)v"y233{0->c}ttelciFc"""
    println(codedString.length)
    var firstPartCodedString = codedString.dropLast(codedString.length/2)
    var secondPartCodedString = codedString.drop(codedString.length/2)

}
fun firstPart (sourceString:String) {
    val shiftedString = sourceString.map {char -> char - 1}.joinToString(“”)
}