package tareas.buclesFuncionales

fun main(){

    val entrada = readln().toInt()
    val resultados = (1..entrada).map {
        val numeros = readln().split(" ").map { it.toInt() }
        val resto = numeros.first()+numeros.last()
        if(resto<0) "NO" else "SI"
    }

    resultados.forEach { println(it) }

}