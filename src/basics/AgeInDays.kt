package basics

import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`);

    var allDays = scanner.nextInt()

    var years = 0;
    var months = 0;
    var days = 0;

    years = allDays / 365;

    months = (allDays % 365) / 30;

    days = allDays - (years * 365) - (months * 30);


    System.out.println("$years ano(s)")
    System.out.println("$months mes(es)")
    System.out.println("$days dia(s)")

}