fun main() {
    val list = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    //val (p, m) = readLine()!!.split(' ').map{ it.toInt() }
    val pm = readLine()!!

    val listAsString = list.joinToString(" ")
    val reverseListAsString = list.reversed().joinToString(" ")

    val occurNextToEachOther = listAsString.contains(pm) || reverseListAsString.contains(pm)
    /*
    val indexOfP = list.indexOf(p)
    val occurNextToEachOther =
        if (list.size < 2 || indexOfP < 0)
            false
        else if (indexOfP == 0)
            list[1] == m
        else if (indexOfP < list.lastIndex)
            list[indexOfP + 1] == m || list[indexOfP - 1] == m
        else
            list[indexOfP - 1] == m
*/
    if (!occurNextToEachOther) {
        println("YES")
    } else {
        println("NO")
    }
}