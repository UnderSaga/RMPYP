class SugareStorage(_volume: Int) {
    private var volume: Int = 0
    init {
        if (_volume >= 0)
            volume = _volume
        else
            println("ты дурака")
    }

    fun decreaseSugar(v: Int): Int{
        if(v >= 0) {
            val a = volume - v
            if (a >= 0)
                volume -= v
            else
                volume = 0
        }
        return volume
    }
    fun increaseSugar(v: Int): Int{
        if(v >= 0)
            volume += v
        return volume
    }

}