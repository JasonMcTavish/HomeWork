import kotlin.random.Random

class Tv(val brand: String, val model: String, val diagonal: Int) {

    var tvIsON = false
        private set
    private var currentVolume: Int = 0
    private var currentChannel: Int = 1
    private val maxChannelNumber = Random.nextInt(10, 20)
    private val channelList = Channels.getRandomChannel(maxChannelNumber)

    fun printInfo(){
        println("Информация о телевизоре:")
        println("Брэнд: $brand. Модель: $model. Диагональ: $diagonal")
    }

    fun turnOnTv() {
        tvIsON = true
        println("Телевизор включен")
    }

    fun turnOffTv() {
        tvIsON = false
        println("Телевизор выключен")
    }

    fun turnOnChannel() {
        do {
            println("Введите номер канала")
            val n = readLine()?.toIntOrNull() ?: return
            if (n <= 0 || n > maxChannelNumber) {
                println("Такой канал отсутствует")
            }
            currentChannel = n
        } while (n <= 0 || n > maxChannelNumber)
        if (!tvIsON) {
            tvIsON = true
            println("Телевизор включен")
        }

        println("Включен канал $currentChannel - ${channelList[currentChannel - 1]}")

    }

    fun channelUp() {
        if (!tvIsON) {
            tvIsON = true
            println("Телевизор включен")
            println("Включен канал $currentChannel - ${channelList[currentChannel - 1]}")
        } else {
            when (currentChannel) {
                in 1 until maxChannelNumber -> currentChannel += 1
                maxChannelNumber -> currentChannel = 1
            }
            println("Включен канал $currentChannel - ${channelList[currentChannel - 1]}")
        }
    }

    fun channelDown() {
        if (!tvIsON) {
            tvIsON = true
            println("Телевизор включен")
            println("Включен канал $currentChannel - ${channelList[currentChannel - 1]}")
        } else {
            when (currentChannel) {
                in 2..maxChannelNumber -> currentChannel -= 1
                1 -> currentChannel = maxChannelNumber
            }
            println("Включен канал $currentChannel - ${channelList[currentChannel - 1]}")
        }
    }

    fun volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume += 1
        }
        println("Уровень звука $currentVolume")

    }

    fun volumeDown() {
        if (currentVolume > 0) {
            currentVolume -= 1
        }
        println("Уровень звука $currentVolume")
    }


    companion object {
        private const val maxVolume = 10
    }
}