fun main ()
{
    val string = """F2p)v"y233{0->c}ttelciFc""" //Разделение сообщения
    val firstPart = string.dropLast(string.length/2) //
    val lastPart = string.drop(string.length/2)
    println(firstPartDecode(firstPart)+secondPartDecode(lastPart))
}

// Объявление функции высшего порядка
//

fun shift (sourceString: String, func: (Char) -> Char):String
{
    return sourceString.map(func).joinToString("")
}

// Объявление функций расшифровки половины сообщения
//

fun firstPartDecode(firstPart:String):String
{
    var firstPart = shift(firstPart){it+1}
    firstPart = firstPart.replace('5','s',true)
    firstPart = firstPart.replace('4','u',true)
    firstPart = shift(firstPart){it-3}
    firstPart = firstPart.replace('0','o',true)
    return firstPart
}
fun secondPartDecode(secondPart:String):String
{
    var secondPart = secondPart.reversed()
    secondPart = shift(secondPart){it-4}
    secondPart = secondPart.replace('_',' ',true)
    return secondPart
}