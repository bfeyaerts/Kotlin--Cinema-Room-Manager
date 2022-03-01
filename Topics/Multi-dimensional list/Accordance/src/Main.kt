fun main() {
    val matrix = MutableList(2) {
        row -> MutableList(3) {
            column -> "[$row][$column]"
        }
    }
    println(matrix)
}