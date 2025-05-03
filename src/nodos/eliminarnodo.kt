
class Nodo(var dato: Int, var sig: Nodo?) {
    override fun toString() = if (sig == null) "$dato" else "$dato -> "
}

class MiListaEnlazada(){
    var nodos: Nodo? = null

    fun insertar(dato: Int){
        nodos = Nodo(dato,nodos)
    }

    fun eliminar(index: Int){

        var nodo = nodos
        repeat(index){
            nodo = nodo?.sig
        }
        nodo?.dato = nodo.sig?.dato!!
        nodo?.sig = nodo.sig?.sig
    }

    override fun toString(): String {
        var txt = ""
        var nodo = nodos
        while(nodo != null){
            txt+=nodo.toString()
            nodo = nodo.sig
        }
        return txt
    }
}

fun main() {
    val miLista = MiListaEnlazada()
    miLista.insertar(1)
    miLista.insertar(2)
    miLista.insertar(3)
    miLista.insertar(4)
    miLista.insertar(5)

    println(miLista)  // [5 -> 4 -> 3 -> 2 -> 1]

    // Eliminamos el índice 0
    miLista.eliminar(0)
    println(miLista)  // [4 -> 3 -> 2 -> 1]

    // Eliminamos el índice 2
    miLista.eliminar(2)
    println(miLista)  // [4 -> 3 -> 1]

}