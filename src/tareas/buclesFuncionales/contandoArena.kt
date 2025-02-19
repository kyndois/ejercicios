package tareas.buclesFuncionales

fun main(){
    val resultados = generateSequence {
        val entrada = readln().toInt()
        if(entrada != 0) {
            "1".repeat(entrada)
        }else null
    }
    resultados.forEach { println(it) }
}