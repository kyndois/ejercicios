package nodos

class Persona(val nombre: String, val edad: Int) {
    override fun toString() = "$nombre($edad)"
}

class NodoPersona(var dato: Persona, var sig: NodoPersona? = null) {
    override fun toString() = if (sig == null) "$dato" else "$dato -> "
}

interface ColaPersonas {
    fun encolar(dato: Persona) // Inserta una persona al final de la cola
    fun desencolar(): Persona // Saca la primera persona de la cola
    fun esVacia(): Boolean // Indica si la cola está vacía
}

class MiColaPersonas : ColaPersonas {
    var cola: NodoPersona? = null
    private var ultimo: NodoPersona? = null

    override fun encolar(dato: Persona) {
        val nodo = NodoPersona(dato)
        if (esVacia()) {
            cola = nodo
            ultimo = nodo
        } else {
            ultimo?.sig = nodo
            ultimo = nodo
        }
    }

    override fun desencolar(): Persona {
        val dato = cola?.dato ?: throw NoSuchElementException("Cola vacía")
        cola = cola?.sig
        if (cola == null) {
            ultimo = null
        }
        return dato
    }

    override fun esVacia(): Boolean {
        return cola == null
    }

    override fun toString(): String {
        var str = ""
        var recorrer = cola
        while (recorrer != null) {
            str += recorrer
            recorrer = recorrer.sig
        }
        return str
    }
}

fun main() {
    val mc = MiColaPersonas().apply {
        encolar(Persona("Ana", 25))
        encolar(Persona("Juan", 30))
        encolar(Persona("Luis", 22))
        encolar(Persona("Marta", 28))
    }

    println(mc)
    println("${mc.desencolar()} ${mc.desencolar()}")
    println(mc)
}