import java.lang.NullPointerException

fun main() {
    val str = null
    println(getLength(str))
}

fun getLength(str: String?): Int {
    return try {
        str!!.length
    } catch (e: NullPointerException) {
        0
    }
}