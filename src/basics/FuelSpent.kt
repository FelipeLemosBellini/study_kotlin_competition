package basics

import java.text.DecimalFormat
import java.util.*

fun main() {

    val scanner: Scanner = Scanner(System.`in`);

    var distancia = scanner.nextDouble()
    var velocidade = scanner.nextDouble()

    var combustivel = (distancia * velocidade) / 12.0;

    val formato = DecimalFormat("#.###")

    val numeroFormatado = formato.format(combustivel)
    System.out.println(numeroFormatado)
}
