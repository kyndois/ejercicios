package nodos

class Editor {
    private val texto = StringBuilder()
    private val history = mutableListOf<String>()

    init {
        // Guardamos el estado inicial (texto vacío)
        history.add(texto.toString())
    }

    fun insert(text: String) {
        texto.append(text)
        // Guardamos el nuevo estado en el historial
        history.add(texto.toString())
    }

    fun delete(length: Int) {
        val inicio = maxOf(0, texto.length - length)
        texto.delete(inicio, texto.length)
        // Guardamos el nuevo estado en el historial
        history.add(texto.toString())
    }

    fun undo() {
        // Si hay estados previos en el historial (más del estado actual)
        if (history.size > 1) {
            // Eliminamos el estado actual (el último añadido)
            history.removeAt(history.size - 1)
            // Restauramos el texto al estado anterior (el último que queda en el historial)
            texto.clear().append(history.last())
        } else {
            // Si no hay estados previos, no hacemos nada (o podríamos indicar que no hay más undo)
            println("No hay más acciones para deshacer.")
        }
    }

    fun getTexto(): String {
        return texto.toString()
    }
}

fun main() {
    val editor = Editor()
    editor.insert("Estimado amigo")
    println(editor.getTexto())

    editor.delete(5)
    println(editor.getTexto())

    editor.insert("enemigo")
    println(editor.getTexto())

    editor.insert(" me las vas a pagar")
    println(editor.getTexto())

    editor.undo()
    println(editor.getTexto())
}

fun main2() {
    val editor = Editor()

    editor.insert("Estimado amigo")
    println(editor.getTexto())

    editor.delete(5)
    println(editor.getTexto())

    editor.insert("enemigo")
    println(editor.getTexto())

    editor.insert(" me las vas a pagar")
    println(editor.getTexto())

    editor.undo()
    editor.undo()
    editor.undo()
    println(editor.getTexto())
}

fun main3() {
    val editor = Editor()

    editor.insert("Estimado amigo")
    println(editor.getTexto())

    editor.delete(5)
    println(editor.getTexto())

    editor.insert("enemigo")
    println(editor.getTexto())

    editor.insert(" me las vas a pagar")
    println(editor.getTexto())

    // Más llamadas a undo() de las necesarias
    repeat(9) { editor.undo() }

    println(editor.getTexto())

    editor.insert("Empecemos ...")
    println(editor.getTexto())
}