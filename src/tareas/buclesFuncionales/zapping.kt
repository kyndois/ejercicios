package tareas.buclesFuncionales

import kotlin.math.abs

fun main() {

    val resultados = generateSequence {
        val entrada = readln().split(" ").map { it.toInt() }
        if (entrada.sum() != 0) {
            val diff = abs(entrada.first() - entrada.last())
            minOf(diff, 99 - diff)
        } else null
    }
    resultados.forEach { println(it) }
}