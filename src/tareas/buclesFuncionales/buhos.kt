package tareas.buclesFuncionales

fun main() {

    val resultados = generateSequence {
        val entrada = readln().replace(" ","").uppercase()
        if(entrada == "XXX") null else if(entrada == entrada.reversed()) "SI" else "NO"
    }
    resultados.forEach { println(it) }
}