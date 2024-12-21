package basics

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner: Scanner = Scanner(System.`in`)

    val input = scanner.nextDouble()

    var showInterval = ""

    showInterval = when {
        (input >= 0.0 && input <= 25.0) -> "Intervalo [0,25]"
        (input > 25.0 && input <= 50.0) -> "Intervalo [25,50]"
        (input > 50.0 && input <= 75.0) -> "Intervalo [50,75]"
        (input > 75.0 && input <= 100.0) -> "Intervalo [75,100]"
        else -> "Fora do intervalo"
    }

    print(showInterval)
}