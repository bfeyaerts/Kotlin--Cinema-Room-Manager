fun main() {
    //Do not touch code below
    var inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    //write your code here
    println("${inputList[0][0]} ${inputList[0][inputList[0].lastIndex]}")
    println("${inputList[inputList.lastIndex][0]} ${inputList[inputList.lastIndex][inputList[0].lastIndex]}")
}