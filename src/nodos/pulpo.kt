package nodos

import java.util.ArrayDeque

fun main() {
    val platos = readln()
    val comensales = readln().split(" ")
    val cola = ArrayDeque(comensales)
    val comensalesConCabeza = mutableSetOf<String>()

    for (tipoPlato in platos) {
        if (cola.isNotEmpty()) {
            val comensalActual = cola.removeFirst()
            if (tipoPlato == 'c') {
                comensalesConCabeza.add(comensalActual)
            }
            cola.addLast(comensalActual)
        }
    }

    val listaOrdenada = comensalesConCabeza.sorted()
    println(listaOrdenada)
}