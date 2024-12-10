/**
 * Recibe dos números separados entre 0-9
 * La secuencia debe ser de manera que cada número será la suma de los 2 anteriores
 * Genera una -->LISTA<-- donde guardar las 10 primeras coincidencias
 * El calculo de cada resultado se hará de forma recursiva
 * Imprimir la secuencia
 */

fun main() {
    val entrada = readln()
    val numeros = entrada.split(" ")
    val secuencia = mutableListOf<Int>()

    secuencia.add(numeros[0].toInt())
    secuencia.add(numeros[1].toInt())

    fun fibonnaciRecur(num1: Int, num2: Int) {
        if(secuencia.size == 10) return
        val resultado = num1 + num2
        secuencia.add(resultado)
        fibonnaciRecur(num2, resultado)
    }

    fibonnaciRecur(numeros[0].toInt(), numeros[1].toInt())

    for (num in secuencia) {
        print("[$num] ")
    }
}

