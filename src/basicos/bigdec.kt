package basicos

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    while (scanner.hasNextLine()){
        val sc = scanner.nextLine()
        val bg = BigDecimal(sc.replace(".",""))
        val resul = bg.add(BigDecimal.ONE)
        val df = DecimalFormat("#,###.##")
        println(df.format(resul))

    }
}