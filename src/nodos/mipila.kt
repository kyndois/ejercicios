
interface Pila {
    fun push(dato: Int) // inserta un elemento en la cabeza de la pila
    fun pop(): Int      // saca un elemento de la cabeza de la pila
    fun peek(): Int     // examina cabeza de la pila
    fun esVacia(): Boolean // true si la pila no tiene elementos
}


class MiPila(): Pila{
    var nodos: Nodo? = null

    override fun push(dato: Int) {
        nodos = Nodo(dato,nodos)
    }

    override fun pop(): Int {
        val dato = nodos?.dato!!
        nodos = nodos?.sig
        return dato
    }

    override fun peek(): Int {
        return nodos?.dato!!
    }

    override fun esVacia(): Boolean {
        return nodos == null
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
    val mipila: Pila = MiPila().apply {
        push(1)
        push(2)
        push(3)
        push(4)
    }

    println(mipila.esVacia())
    println(mipila)
    println(mipila.peek())
    while (!mipila.esVacia()) {
        print("${mipila.pop()} ")
    }
}