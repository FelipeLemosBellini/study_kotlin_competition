import java.util.*

fun main(args: Array<String>) {

    val scanner: Scanner = Scanner(System.`in`);

    var counterMinutes = 0

    val hoursAndMinutes: String = scanner.nextLine();

    var listNumbers = hoursAndMinutes.split(" ")

    var startSleep = (listNumbers[0].toInt() * 60 + listNumbers[1].toInt())
    var endSleep = (listNumbers[2].toInt() * 60 + listNumbers[3].toInt())

    if (endSleep < startSleep) {
        counterMinutes = endSleep + 1440 - startSleep
    } else {
        counterMinutes = endSleep - startSleep
    }

    print(if (counterMinutes == 0) "" else counterMinutes)
}