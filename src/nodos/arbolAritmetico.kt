package nodos

class NodoArbol(var dato: String) {
    var nodoIzq: NodoArbol? = null
    var nodoDer: NodoArbol? = null
}

class Arbol {
    var raiz: NodoArbol? = null

    fun getValor(): Int {
        return calcular(raiz)
    }

    private fun calcular(nodo: NodoArbol?): Int {
        if (nodo == null) {
            throw IllegalArgumentException("Nodo nulo en el árbol")
        }

        return when (nodo.dato) {
            "+" -> calcular(nodo.nodoIzq) + calcular(nodo.nodoDer)
            "-" -> calcular(nodo.nodoIzq) - calcular(nodo.nodoDer)
            "x" -> calcular(nodo.nodoIzq) * calcular(nodo.nodoDer)
            "/" -> {
                val divisor = calcular(nodo.nodoDer)
                if (divisor == 0) {
                    throw ArithmeticException("División por cero")
                }
                calcular(nodo.nodoIzq) / divisor
            }
            else -> nodo.dato.toInt()
        }
    }

    fun getExpresion(): String {
        return obtenerExpresion(raiz)
    }

    private fun obtenerExpresion(nodo: NodoArbol?): String {
        if (nodo == null) {
            return ""
        }

        return if (nodo.nodoIzq == null && nodo.nodoDer == null) {
            nodo.dato
        } else {
            "(" + obtenerExpresion(nodo.nodoIzq) + nodo.dato + obtenerExpresion(nodo.nodoDer) + ")"
        }
    }
}

fun main() {
    val arbol = Arbol()
    val n = NodoArbol("x")
    arbol.raiz = n
    val n1 = NodoArbol("-")
    val n2 = NodoArbol("3")
    n.nodoIzq = n1
    n.nodoDer = n2
    val n11 = NodoArbol("9")
    val n12 = NodoArbol("+")
    n1.nodoIzq = n11
    n1.nodoDer = n12
    val n121 = NodoArbol("5")
    val n122 = NodoArbol("2")
    n12.nodoIzq = n121
    n12.nodoDer = n122

    println(arbol.getValor())
    println(arbol.getExpresion())
}