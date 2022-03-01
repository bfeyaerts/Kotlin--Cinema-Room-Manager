package cinema

fun main() {
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val seatsPerRow = readLine()!!.toInt()
    val totalSeats = rows * seatsPerRow

    val cinema = MutableList(rows) {
        MutableList(seatsPerRow) {
            "S"
        }
    }

    var ticketsSold = 0
    var currentIncome = 0
    val totalIncome = if (totalSeats <= 60) {
        totalSeats * 10
    } else {
        val frontRows = rows / 2
        val backRows = rows - frontRows

        val frontProfit = frontRows * seatsPerRow * 10
        val backProfit = backRows * seatsPerRow * 8
        frontProfit + backProfit
    }

    while (true) {
        println("1. Show the seats")
        println("2. Buy a ticket")
        println("3. Statistics")
        println("0. Exit")

        when(readLine()!!.toInt()) {
            0 -> break
            1 -> printCinema(cinema)
            2 -> {
                var ticketPrice = 0
                do {
                    println("Enter a row number:")
                    val row = readLine()!!.toInt()
                    println("Enter a seat number in that row:")
                    val seat = readLine()!!.toInt()

                    if (row !in 1 .. cinema.size || seat !in 1 .. cinema[row - 1].size) {
                        println("Wrong input!")
                    } else if (cinema[row - 1][seat - 1] == "B") {
                        println("That ticket has already been purchased!")
                    } else {
                        ticketPrice =
                            if (totalSeats <= 60 || row <= rows / 2) {
                                10
                            } else {
                                8
                            }
                        println("Ticket price: $$ticketPrice")
                        cinema[row - 1][seat - 1] = "B"
                    }
                } while (ticketPrice == 0)
                ticketsSold++
                currentIncome += ticketPrice
            }
            3 -> {
                println("Number of purchased tickets: $ticketsSold")
                println("Percentage: ${String.format("%.2f%%", ticketsSold * 100.0 / totalSeats)}")
                println("Current income: $${currentIncome}")
                println("Total income: $${totalIncome}")
            }
        }
        println()
    }
}

fun printCinema(cinema: MutableList<MutableList<String>>) {
    println("Cinema:")
    print(" ")
    repeat(cinema[0].size) {
        print(" ${it + 1}")
    }
    println()
    repeat(cinema.size) { row ->
        print("${row + 1}")
        repeat(cinema[row].size) { seat ->
            print(" ${cinema[row][seat]}")
        }
        println()
    }
}