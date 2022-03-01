import kotlin.Exception        

fun calculateBrakingDistance(v1: String, a: String): Int {
    // write your code here
    try {
        val v1Int = v1.toInt()
        val aInt = a.toInt()
        return - (v1Int * v1Int) / (2 * aInt)
    } catch (e: ArithmeticException) {
        println("The car does not slow down!")
        return -1
    } catch (e: Exception) {
        println(e.message)
        return -1
    }
}