fun main() {
    val start1 = readLine()!!.toInt()
    val end1 = readLine()!!.toInt()
    val start2 = readLine()!!.toInt()
    val end2 = readLine()!!.toInt()
    val number = readLine()!!.toInt()

    println(number in start1 .. end1 && number in start2 .. end2)
}