fun main(){
    val firstName: String = "Aleksandr"
    val lastName: String = "Aleynikov"
    var height: Double = 1.70
    val weight: Float = 92.3f
    var isChild = height < 1.5 || weight < 40f
    var info = "My name is $firstName and my surname $lastName. " +
            "My height is $height and weight is $weight. I'm a child is $isChild. "
    println(info)
    height = 1.45
    isChild = height < 1.5 || weight < 40f

    info = "My name is $firstName and my surname $lastName. " +
            "My height is $height and weight is $weight. I'm a child is $isChild. "
    println(info)

}