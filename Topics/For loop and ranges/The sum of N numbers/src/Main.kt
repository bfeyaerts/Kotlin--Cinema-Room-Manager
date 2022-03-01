fun main() {
    val n = readLine()!!.toInt()
    var result = 0
    for (i in 1 .. n) {
        result += readLine()!!.toInt()
    }
    println(result)
}