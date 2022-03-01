fun parseCardNumber(cardNumber: String): Long {
    if (cardNumber.length != 16 + 3)
        throw IllegalArgumentException()
    val parts = cardNumber.split(' ')
    if (parts.size != 4)
        throw IllegalArgumentException()
    for (part in parts)
        if (part.length != 4)
            throw IllegalArgumentException()
    val withoutSpaces = parts.joinToString("")
    return withoutSpaces.toLong()
}