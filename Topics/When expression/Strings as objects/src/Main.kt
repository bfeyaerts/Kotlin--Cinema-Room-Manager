fun main() {
    val input = readLine()!!
    if (input.isEmpty())
        println()
    else {
        println(
            when (input.first()) {
                'i' -> input.substring(1).toInt() + 1
                's' -> input.substring(1).reversed()
                else -> input
            }
        )
    }
}