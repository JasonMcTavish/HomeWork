fun main(){
val lg = Tv("Lg","65UP75",65)
    lg.printInfo()
    val samsung = Tv ("Samsung", "234jkhb234", 30)
    samsung.printInfo()
    samsung.turnOnTv()

    Thread.sleep(1000)

    lg.turnOnChannel()
    println()
    lg.turnOffTv()
    Thread.sleep(1000)

    for (it in 0..21)
    {lg.channelUp()}
    println()
    lg.turnOffTv()
    Thread.sleep(1000)

    for (it in 0..21)
    {lg.channelDown()}
    Thread.sleep(1000)

    for (it in 0..11)
    {lg.volumeUp()}
    Thread.sleep(1000)

    for (it in 0..11)
    {lg.volumeDown()}

}