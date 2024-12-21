import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

fun main(args: Array<String>) {

    val scanner: Scanner = Scanner(System.`in`)

    val numbers = scanner.nextLine()

    val listNumbers = numbers.split(" ").map { it.toBigDecimal() }

    val areaOfTheRectangledTriangle: BigDecimal =
        listNumbers[0] * listNumbers[2] / 2.toBigDecimal()
    val areaRadiusCircle: BigDecimal = Math.PI.toBigDecimal() * listNumbers[2].pow(2)
    val areaOfTheTrapezium: BigDecimal = ((listNumbers[0] + listNumbers[1]) * listNumbers[2]) / 2.toBigDecimal()
    val areaQuare: BigDecimal = listNumbers[1].pow(2)
    val areaRectangle: BigDecimal = listNumbers[0] * listNumbers[1]

    println("TRIANGULO: ${formatterNumber(areaOfTheRectangledTriangle)}")
    println("CIRCULO: ${formatterNumber(areaRadiusCircle)}")
    println("TRAPEZIO: ${formatterNumber(areaOfTheTrapezium)}")
    println("QUADRADO: ${formatterNumber(areaQuare)}")
    println("RETANGULO: ${formatterNumber(areaRectangle)}")
}

fun formatterNumber(number: BigDecimal): String {

    val numbers = roundingCeiling(number)
    return numbers[0] + "." + getFormattedDecimalNumbers(numbers[1])
}

fun getFormattedDecimalNumbers(number: String): String {
    if (number.length >= 3) {
        return number.subSequence(0, 3).toString()
    } else {
        return number + "0"
    }
}

fun roundingCeiling(number: BigDecimal): List<String> {
    return number.setScale(3, RoundingMode.UP).toString().split(".")
}