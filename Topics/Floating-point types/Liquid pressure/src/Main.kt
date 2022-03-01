const val GRAVITY = 9.8

fun main() {
    val rho = readLine()!!.toDouble()
    val height = readLine()!!.toDouble()
    println(rho * GRAVITY * height)
}