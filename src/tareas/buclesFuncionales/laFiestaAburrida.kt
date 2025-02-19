package tareas.buclesFuncionales

fun main(){

    val entrada = readln().toInt()
    val resultados = (1..entrada).map {
        val name = readln().split(" ").last()
        "Hola, $name."
    }
    resultados.forEach { println(it) }
}