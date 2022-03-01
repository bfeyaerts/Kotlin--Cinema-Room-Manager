fun main() {
    val n = readLine()!!.toInt()
    val list = MutableList(n) {readLine()!!.toInt()}
    val (p, m) = readLine()!!.split(' ').map { it.toInt() }
    if (p in list && m in list) {
        println("YES")
    } else {
        println("NO")
    }
}