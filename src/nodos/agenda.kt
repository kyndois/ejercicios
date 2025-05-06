
class Persona(val nombre: String, val telefono: String) {
    override fun toString() = "($nombre, $telefono)"
}
class NodoArbol(val datos: Persona, var nodoIzq: NodoArbol? = null, var nodoDer: NodoArbol? = null)

class Agenda(){
    var raiz: NodoArbol? = null

    fun insertar(persona: Persona) {
        raiz = insertarRec(raiz, persona)
    }

    private fun insertarRec(nodo: NodoArbol?, persona: Persona): NodoArbol? {
        if (nodo == null) {
            return NodoArbol(persona)
        }

        if (persona.nombre < nodo.datos.nombre) {
            nodo.nodoIzq = insertarRec(nodo.nodoIzq, persona)
        } else if (persona.nombre > nodo.datos.nombre) {
            nodo.nodoDer = insertarRec(nodo.nodoDer, persona)
        }
        // Si el nombre ya existe, no hacemos nada (se podría modificar este comportamiento)
        return nodo
    }

    fun getTelefono(nombre: String) {
        val nodo = buscarRec(raiz, nombre)
        if (nodo != null) {
            println("El teléfono de $nombre es: ${nodo.datos.telefono}")
        } else {
            println("No se encontró a $nombre en la agenda.")
        }
    }

    private fun buscarRec(nodo: NodoArbol?, nombre: String): NodoArbol? {
        if (nodo == null || nodo.datos.nombre == nombre) {
            return nodo
        }

        return if (nombre < nodo.datos.nombre) {
            buscarRec(nodo.nodoIzq, nombre)
        } else {
            buscarRec(nodo.nodoDer, nombre)
        }
    }

    fun imprimirEnOrden() {
        imprimirEnOrdenRec(raiz)
    }

    private fun imprimirEnOrdenRec(nodo: NodoArbol?) {
        nodo?.nodoIzq?.let { imprimirEnOrdenRec(it) }
        nodo?.let { println(it.datos) }
        nodo?.nodoDer?.let { imprimirEnOrdenRec(it) }
    }
}

fun main() {
    val agenda = Agenda().apply {
        insertar(Persona("Román", "333333333"))
        insertar(Persona("Ana", "123456789"))
        insertar(Persona("Elías", "987654321"))
        insertar(Persona("Juan", "555555555"))
        insertar(Persona("María", "666666666"))
    }

    agenda.getTelefono("Juan")
    agenda.getTelefono("Telma")

    agenda.imprimirEnOrden()
}