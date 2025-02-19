package tareas.buclesFuncionales

fun main(){

    val casos = readln().toInt()
    val resultados = (1..casos).map {
        val entrada = readln().split(" es ").map { it.lowercase() }
        if(entrada.first()==entrada.last()) "TAUTOLOGIA" else "NO TAUTOLOGIA"
    }
    resultados.forEach { println(it) }
}