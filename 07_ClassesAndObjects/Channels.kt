object Channels {
    private val channelList = mutableListOf<String>(
        "Первый",
        "Россия-1",
        "Матч ТВ",
        "НТВ",
        "Пятый канал",
        "Россия-К",
        "Россия-24",
        "Карусель",
        "ОТР",
        "ТВЦентр",
        "РенТВ",
        "Спас",
        "СТС",
        "Домашний",
        "ТВ-3",
        "Пятница",
        "Звезда",
        "ТНТ",
        "МузТВ",
        "Телемагазин"
    )

    fun getRandomChannel(n: Int): MutableList<String> {
        val returnedChannelList = mutableListOf<String>()
        channelList.shuffle()
        for (it in 0 until n) {
            returnedChannelList.add(channelList[it])
        }
        return returnedChannelList
    }
}