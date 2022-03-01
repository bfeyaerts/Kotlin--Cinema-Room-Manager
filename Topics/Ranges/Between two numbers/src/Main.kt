fun main() {
    val number = readLine()!!.toInt()
    val start = readLine()!!.toInt()
    val end = readLine()!!.toInt()

    println(number in start .. end)
}