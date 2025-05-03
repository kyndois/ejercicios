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

class MiColaPersonas(): ColaPersonas{
    var cola: NodoPersona? = null
    override fun encolar(dato: Persona) {
        var ultimo = cola
        while (cola?.sig != null){
            ultimo = cola?.sig
        }

    }

    override fun desencolar(): Persona {
        TODO("Not yet implemented")
    }

    override fun esVacia(): Boolean {
        TODO("Not yet implemented")
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