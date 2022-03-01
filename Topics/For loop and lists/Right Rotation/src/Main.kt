fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    if (n > 0) {
        for (i in 1..n) {
            list.add(readLine()!!.toInt())
        }
    }
    val m = readLine()!!.toInt()
    if (n > 0 && m > 0) {
        for (i in 1..m % n) {
            list.add(0, list.removeLast())
        }
    }
    println(list.joinToString(" "))
}