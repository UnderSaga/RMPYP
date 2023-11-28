fun main() {
    val n = readln().toInt()
    println(getCubeList(n))
}

fun getCubeList(n: Int): String {
    var str = ""
    var i = 0
    while(n > i)
    {
        str += i * i * i
        str += " "
        i += 1
    }

    return str
}